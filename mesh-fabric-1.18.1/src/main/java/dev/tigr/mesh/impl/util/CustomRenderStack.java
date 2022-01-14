package dev.tigr.mesh.impl.util;

import dev.tigr.mesh.util.render.IRenderStack;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.Quaternion;

/**
 * @author Tigermouthbear 1/10/22
 */
public class CustomRenderStack implements IRenderStack {
    private final MatrixStack matrixStack = new MatrixStack();

    @Override
    public void push() {
        matrixStack.push();
    }

    @Override
    public void pop() {
        matrixStack.pop();
    }

    @Override
    public void scale(double x, double y, double z) {
        matrixStack.scale((float) x, (float) y, (float) z);
    }

    @Override
    public void translate(double x, double y, double z) {
        matrixStack.translate(x, y, z);
    }

    @Override
    public void rotate(float angle, float x, float y, float z) {
        matrixStack.multiply(new Quaternion(x * angle, y * angle, z * angle, true));
    }

    public MatrixStack getMatrixStack() {
        return matrixStack;
    }
}
