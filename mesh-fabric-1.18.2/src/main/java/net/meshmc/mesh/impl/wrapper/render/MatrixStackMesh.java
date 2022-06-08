package net.meshmc.mesh.impl.wrapper.render;

import net.meshmc.mesh.api.render.MatrixStack;
import net.minecraft.util.math.Quaternion;

/**
 * @author Tigermouthbear 1/15/22
 */
public class MatrixStackMesh implements MatrixStack {
    private net.minecraft.client.util.math.MatrixStack matrixStack = new net.minecraft.client.util.math.MatrixStack();

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

    public void setMatrixStack(net.minecraft.client.util.math.MatrixStack matrixStack) {
        this.matrixStack = matrixStack;
    }

    public net.minecraft.client.util.math.MatrixStack getMatrixStack() {
        return matrixStack;
    }
}
