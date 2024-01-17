package rendering.components;

import util.OnscreenCoordinate;
import util.RenderingCoordinate;
import util.Vec3D;
import world.World;
import world.Object3D;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class WorldRenderer extends JComponent {
    private World world;

    public WorldRenderer() {
        world = new World();
    }

    public void setWorld(World world) {
        if (world == null) {
            throw new RuntimeException("New world cannot be null");
        } else {
            this.world = world;
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        ArrayList<Object3D> worldObjects = world.getWorldObjects();
        for (Object3D object: worldObjects) {
            Vec3D[] vertices = object.getVertices();
            int[] vertexLayout = object.getVertexLayout();

            if (vertexLayout.length % 3 != 0) {
                throw new RuntimeException("Vertex Layout with n % 3 != 0 entries");
            } else {
                for (int i = 0; i < vertexLayout.length; i += 3) {
                    RenderingCoordinate v1 = transformVec3D(vertices[vertexLayout[i]]);
                    RenderingCoordinate v2 = transformVec3D(vertices[vertexLayout[i+1]]);
                    RenderingCoordinate v3 = transformVec3D(vertices[vertexLayout[i+2]]);
                    drawTriangle(
                            g,
                            transformRenderingCoordinate(v1),
                            transformRenderingCoordinate(v2),
                            transformRenderingCoordinate(v3)
                    );
                }
            }
        }
    }

    private OnscreenCoordinate transformRenderingCoordinate(RenderingCoordinate rc) {
        return new OnscreenCoordinate(
                (int) ((rc.x + 1) * (getWidth() / 2.0)),
                (int) ((1 - rc.y) * (getHeight() / 2.0))
        );
    }

    private RenderingCoordinate transformVec3D(Vec3D vec) {
        // Muss für ein komplexeres Koordinatensystem angepasst werden
        // Komplexeres Koordinatensystem definitiv wünschenswert

        // Vorübergehend wird 3D Effekt künstlich erzeugt. Muss durch Inhalt der FA ersetzt werden
        double rx = vec.x + 0.707 * vec.y;
        double ry = vec.z + 0.35 * vec.y;
        return new RenderingCoordinate(rx, ry);
    }

    public static void drawTriangle(Graphics g, OnscreenCoordinate v1, OnscreenCoordinate v2, OnscreenCoordinate v3) {
        g.setColor(Color.BLACK);
        g.drawLine(v1.x, v1.y, v2.x, v2.y);
        g.drawLine(v2.x, v2.y, v3.x, v3.y);
        g.drawLine(v3.x, v3.y, v1.x, v1.y);
    }
}
