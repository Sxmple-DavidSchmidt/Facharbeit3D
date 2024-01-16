package rendering.components;

import math.Int2D;
import math.Vec3D;
import world.World;
import world.objects.Object3D;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

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
                throw new RuntimeException("Vertex Layout with n % 3 != 0");
            } else {
                for (int i = 0; i < vertexLayout.length; i += 3) {
                    Int2D v1 = transformVec3D(vertices[vertexLayout[i]]);
                    Int2D v2 = transformVec3D(vertices[vertexLayout[i+1]]);
                    Int2D v3 = transformVec3D(vertices[vertexLayout[i+2]]);
                    drawTriangle(g, v1, v2, v3);
                }
            }

            for (Vec3D vertex: vertices) {
                Int2D v = transformVec3D(vertex);
                g.fillOval(v.x - 5, v.y - 5, 10, 10);
            }

        }
    }

    private Int2D transformVec3D(Vec3D vec) {
        return new Int2D((int) (vec.x * 100 + getWidth() / 2), (int) (vec.y * 100 + getHeight() / 2));
    }

    public static void drawTriangle(Graphics g, Int2D v1, Int2D v2, Int2D v3) {
        Color c = Color.BLACK;
        switch (new Random().nextInt(0, 5)) {
            case 0:
                c = Color.BLUE;
                break;
            case 1:
                c = Color.CYAN;
                break;
            case 2:
                c = Color.GREEN;
                break;
            case 3:
                c = Color.MAGENTA;
                break;
            case 4:
                c = Color.ORANGE;
                break;
            case 5:
                c = Color.RED;
                break;
        }

        g.setColor(c);
        //g.fillPolygon(new int[] {v1.x, v2.x, v3.x}, new int[] {v1.y, v2.y, v3.y}, 3);

        g.setColor(Color.BLACK);
        g.drawLine(v1.x, v1.y, v2.x, v2.y);
        g.drawLine(v2.x, v2.y, v3.x, v3.y);
        g.drawLine(v3.x, v3.y, v1.x, v1.y);

    }
}