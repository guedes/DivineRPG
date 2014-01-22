package net.divinerpg.twilight.entity.mob.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelDenseDemon extends ModelBase
{
    //fields
    ModelRenderer Main_Body;
    ModelRenderer Lower_Body;
    ModelRenderer Legbottom1;
    ModelRenderer Legbottom2;
    ModelRenderer Legbottom3;
    ModelRenderer Legbottom4;
    ModelRenderer Legbottom5;
    ModelRenderer Legbottom6;
    ModelRenderer Legbottom7;
    ModelRenderer Legbottom8;
    ModelRenderer Legbottom9;
    ModelRenderer Legbottom10;
    ModelRenderer Legbottom11;
    ModelRenderer Legbottom12;
    ModelRenderer Legbottom13;
    ModelRenderer Legbottom14;
    ModelRenderer Legbottom15;
    ModelRenderer Legbottom16;
    ModelRenderer Legbottom17;
    ModelRenderer Legbottom18;
    ModelRenderer Legbottom19;
    ModelRenderer Legbottom20;
    ModelRenderer Legbottom21;
    ModelRenderer Legbottom22;
    ModelRenderer Legbottom23;
    ModelRenderer Legbottom24;
    ModelRenderer Legbottom25;

    public ModelDenseDemon()
    {
        textureWidth = 64;
        textureHeight = 32;

        Main_Body = new ModelRenderer(this, 0, 0);
        Main_Body.addBox(0F, 0F, 0F, 10, 6, 10);
        Main_Body.setRotationPoint(-6F, 6F, 2F);
        Main_Body.setTextureSize(64, 32);
        Main_Body.mirror = true;
        setRotation(Main_Body, 0F, 1.570796F, 0F);
        Lower_Body = new ModelRenderer(this, 39, 20);
        Lower_Body.addBox(0F, 0F, 0F, 6, 6, 6);
        Lower_Body.setRotationPoint(-4F, 9F, 0F);
        Lower_Body.setTextureSize(64, 32);
        Lower_Body.mirror = true;
        setRotation(Lower_Body, 0F, 1.570796F, 0F);
        Legbottom1 = new ModelRenderer(this, 14, 5);
        Legbottom1.addBox(0F, 0F, 0F, 3, 2, 2);
        Legbottom1.setRotationPoint(4F, 8F, 0F);
        Legbottom1.setTextureSize(64, 32);
        Legbottom1.mirror = true;
        setRotation(Legbottom1, 0F, 0F, 0F);
        Legbottom2 = new ModelRenderer(this, 14, 5);
        Legbottom2.addBox(0F, 0F, 0F, 3, 2, 2);
        Legbottom2.setRotationPoint(4F, 8F, -7F);
        Legbottom2.setTextureSize(64, 32);
        Legbottom2.mirror = true;
        setRotation(Legbottom2, 0F, 0F, 0F);
        Legbottom3 = new ModelRenderer(this, 14, 18);
        Legbottom3.addBox(0F, 0F, 0F, 2, 2, 5);
        Legbottom3.setRotationPoint(4F, 1F, -5F);
        Legbottom3.setTextureSize(64, 32);
        Legbottom3.mirror = true;
        setRotation(Legbottom3, -1.570796F, 1.570796F, 0F);
        Legbottom4 = new ModelRenderer(this, 14, 18);
        Legbottom4.addBox(0F, 0F, 0F, 2, 2, 5);
        Legbottom4.setRotationPoint(4F, 1F, 2F);
        Legbottom4.setTextureSize(64, 32);
        Legbottom4.mirror = true;
        setRotation(Legbottom4, -1.570796F, 1.570796F, 0F);
        Legbottom5 = new ModelRenderer(this, 14, 18);
        Legbottom5.addBox(0F, 0F, 0F, 2, 2, 5);
        Legbottom5.setRotationPoint(-2F, 15F, -4F);
        Legbottom5.setTextureSize(64, 32);
        Legbottom5.mirror = true;
        setRotation(Legbottom5, -1.570796F, 1.570796F, 0F);
        Legbottom6 = new ModelRenderer(this, 14, 18);
        Legbottom6.addBox(0F, 0F, 0F, 2, 2, 5);
        Legbottom6.setRotationPoint(2F, 15F, -4F);
        Legbottom6.setTextureSize(64, 32);
        Legbottom6.mirror = true;
        setRotation(Legbottom6, -1.570796F, 1.570796F, 0F);
        Legbottom7 = new ModelRenderer(this, 14, 18);
        Legbottom7.addBox(0F, 0F, 0F, 2, 2, 5);
        Legbottom7.setRotationPoint(-2F, 15F, 0F);
        Legbottom7.setTextureSize(64, 32);
        Legbottom7.mirror = true;
        setRotation(Legbottom7, -1.570796F, 1.570796F, 0F);
        Legbottom8 = new ModelRenderer(this, 14, 18);
        Legbottom8.addBox(0F, 0F, 0F, 2, 2, 5);
        Legbottom8.setRotationPoint(2F, 15F, 0F);
        Legbottom8.setTextureSize(64, 32);
        Legbottom8.mirror = true;
        setRotation(Legbottom8, -1.570796F, 1.570796F, 0F);
        Legbottom9 = new ModelRenderer(this, 14, 18);
        Legbottom9.addBox(0F, 0F, 0F, 2, 2, 5);
        Legbottom9.setRotationPoint(0F, 1F, 2F);
        Legbottom9.setTextureSize(64, 32);
        Legbottom9.mirror = true;
        setRotation(Legbottom9, -1.570796F, 1.570796F, 0F);
        Legbottom10 = new ModelRenderer(this, 14, 18);
        Legbottom10.addBox(0F, 0F, 0F, 2, 2, 5);
        Legbottom10.setRotationPoint(0F, 1F, -5F);
        Legbottom10.setTextureSize(64, 32);
        Legbottom10.mirror = true;
        setRotation(Legbottom10, -1.570796F, 1.570796F, 0F);
        Legbottom11 = new ModelRenderer(this, 14, 18);
        Legbottom11.addBox(0F, 0F, 0F, 2, 2, 5);
        Legbottom11.setRotationPoint(4F, 1F, -2F);
        Legbottom11.setTextureSize(64, 32);
        Legbottom11.mirror = true;
        setRotation(Legbottom11, -1.570796F, 1.570796F, 0F);
        Legbottom12 = new ModelRenderer(this, 14, 18);
        Legbottom12.addBox(0F, 0F, 0F, 2, 2, 5);
        Legbottom12.setRotationPoint(0F, 1F, -2F);
        Legbottom12.setTextureSize(64, 32);
        Legbottom12.mirror = true;
        setRotation(Legbottom12, -1.570796F, 1.570796F, 0F);
        Legbottom13 = new ModelRenderer(this, 14, 5);
        Legbottom13.addBox(0F, 0F, 0F, 3, 2, 2);
        Legbottom13.setRotationPoint(4F, 8F, -4F);
        Legbottom13.setTextureSize(64, 32);
        Legbottom13.mirror = true;
        setRotation(Legbottom13, 0F, 0F, 0F);
        Legbottom14 = new ModelRenderer(this, 14, 18);
        Legbottom14.addBox(0F, 0F, 0F, 2, 2, 5);
        Legbottom14.setRotationPoint(-4F, 1F, -5F);
        Legbottom14.setTextureSize(64, 32);
        Legbottom14.mirror = true;
        setRotation(Legbottom14, -1.570796F, 1.570796F, 0F);
        Legbottom15 = new ModelRenderer(this, 14, 18);
        Legbottom15.addBox(0F, 0F, 0F, 2, 2, 5);
        Legbottom15.setRotationPoint(-4F, 1F, -2F);
        Legbottom15.setTextureSize(64, 32);
        Legbottom15.mirror = true;
        setRotation(Legbottom15, -1.570796F, 1.570796F, 0F);
        Legbottom16 = new ModelRenderer(this, 14, 18);
        Legbottom16.addBox(0F, 0F, 0F, 2, 2, 5);
        Legbottom16.setRotationPoint(-4F, 1F, 2F);
        Legbottom16.setTextureSize(64, 32);
        Legbottom16.mirror = true;
        setRotation(Legbottom16, -1.570796F, 1.570796F, 0F);
        Legbottom17 = new ModelRenderer(this, 14, 5);
        Legbottom17.addBox(0F, 0F, 0F, 3, 2, 2);
        Legbottom17.setRotationPoint(4F, 5F, -7F);
        Legbottom17.setTextureSize(64, 32);
        Legbottom17.mirror = true;
        setRotation(Legbottom17, 0F, 0F, 0F);
        Legbottom18 = new ModelRenderer(this, 14, 5);
        Legbottom18.addBox(0F, 0F, 0F, 3, 2, 2);
        Legbottom18.setRotationPoint(4F, 5F, -4F);
        Legbottom18.setTextureSize(64, 32);
        Legbottom18.mirror = true;
        setRotation(Legbottom18, 0F, 0F, 0F);
        Legbottom19 = new ModelRenderer(this, 14, 5);
        Legbottom19.addBox(0F, 0F, 0F, 3, 2, 2);
        Legbottom19.setRotationPoint(4F, 5F, 0F);
        Legbottom19.setTextureSize(64, 32);
        Legbottom19.mirror = true;
        setRotation(Legbottom19, 0F, 0F, 0F);
        Legbottom20 = new ModelRenderer(this, 14, 5);
        Legbottom20.addBox(0F, 0F, 0F, 3, 2, 2);
        Legbottom20.setRotationPoint(-9F, 5F, -7F);
        Legbottom20.setTextureSize(64, 32);
        Legbottom20.mirror = true;
        setRotation(Legbottom20, 0F, 0F, 0F);
        Legbottom21 = new ModelRenderer(this, 14, 5);
        Legbottom21.addBox(0F, 0F, 0F, 3, 2, 2);
        Legbottom21.setRotationPoint(-9F, 5F, -4F);
        Legbottom21.setTextureSize(64, 32);
        Legbottom21.mirror = true;
        setRotation(Legbottom21, 0F, 0F, 0F);
        Legbottom22 = new ModelRenderer(this, 14, 5);
        Legbottom22.addBox(0F, 0F, 0F, 3, 2, 2);
        Legbottom22.setRotationPoint(-9F, 5F, 0F);
        Legbottom22.setTextureSize(64, 32);
        Legbottom22.mirror = true;
        setRotation(Legbottom22, 0F, 0F, 0F);
        Legbottom23 = new ModelRenderer(this, 14, 5);
        Legbottom23.addBox(0F, 0F, 0F, 3, 2, 2);
        Legbottom23.setRotationPoint(-9F, 8F, 0F);
        Legbottom23.setTextureSize(64, 32);
        Legbottom23.mirror = true;
        setRotation(Legbottom23, 0F, 0F, 0F);
        Legbottom24 = new ModelRenderer(this, 14, 5);
        Legbottom24.addBox(0F, 0F, 0F, 3, 2, 2);
        Legbottom24.setRotationPoint(-9F, 8F, -4F);
        Legbottom24.setTextureSize(64, 32);
        Legbottom24.mirror = true;
        setRotation(Legbottom24, 0F, 0F, 0F);
        Legbottom25 = new ModelRenderer(this, 14, 5);
        Legbottom25.addBox(0F, 0F, 0F, 3, 2, 2);
        Legbottom25.setRotationPoint(-9F, 8F, -7F);
        Legbottom25.setTextureSize(64, 32);
        Legbottom25.mirror = true;
        setRotation(Legbottom25, 0F, 0F, 0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5);
        Main_Body.render(f5);
        Lower_Body.render(f5);
        Legbottom1.render(f5);
        Legbottom2.render(f5);
        Legbottom3.render(f5);
        Legbottom4.render(f5);
        Legbottom5.render(f5);
        Legbottom6.render(f5);
        Legbottom7.render(f5);
        Legbottom8.render(f5);
        Legbottom9.render(f5);
        Legbottom10.render(f5);
        Legbottom11.render(f5);
        Legbottom12.render(f5);
        Legbottom13.render(f5);
        Legbottom14.render(f5);
        Legbottom15.render(f5);
        Legbottom16.render(f5);
        Legbottom17.render(f5);
        Legbottom18.render(f5);
        Legbottom19.render(f5);
        Legbottom20.render(f5);
        Legbottom21.render(f5);
        Legbottom22.render(f5);
        Legbottom23.render(f5);
        Legbottom24.render(f5);
        Legbottom25.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6)
    {
        this.Legbottom1.rotateAngleX = 0.2F * MathHelper.sin(par3 * 0.3F) + 0.4F;
        this.Legbottom2.rotateAngleX = 0.2F * MathHelper.sin(par3 * 0.3F) + 0.4F;
        this.Legbottom3.rotateAngleX = 0.2F * MathHelper.sin(par3 * 0.3F) + 0.4F;
        this.Legbottom4.rotateAngleX = 0.2F * MathHelper.sin(par3 * 0.3F) + 0.4F;
        this.Legbottom5.rotateAngleX = 0.2F * MathHelper.sin(par3 * 0.3F) + 0.4F;
        this.Legbottom6.rotateAngleX = 0.2F * MathHelper.sin(par3 * 0.3F) + 0.4F;
        this.Legbottom7.rotateAngleX = 0.2F * MathHelper.sin(par3 * 0.3F) + 0.4F;
        this.Legbottom8.rotateAngleX = 0.2F * MathHelper.sin(par3 * 0.3F) + 0.4F;
        this.Legbottom9.rotateAngleX = 0.2F * MathHelper.sin(par3 * 0.3F) + 0.4F;
        this.Legbottom10.rotateAngleX = 0.2F * MathHelper.sin(par3 * 0.3F) + 0.4F;
        this.Legbottom11.rotateAngleX = 0.2F * MathHelper.sin(par3 * 0.3F) + 0.4F;
        this.Legbottom12.rotateAngleX = 0.2F * MathHelper.sin(par3 * 0.3F) + 0.4F;
        this.Legbottom13.rotateAngleX = 0.2F * MathHelper.sin(par3 * 0.3F) + 0.4F;
        this.Legbottom14.rotateAngleX = 0.2F * MathHelper.sin(par3 * 0.3F) + 0.4F;
        this.Legbottom15.rotateAngleX = 0.2F * MathHelper.sin(par3 * 0.3F) + 0.4F;
        this.Legbottom16.rotateAngleX = 0.2F * MathHelper.sin(par3 * 0.3F) + 0.4F;
        this.Legbottom17.rotateAngleX = 0.2F * MathHelper.sin(par3 * 0.3F) + 0.4F;
        this.Legbottom18.rotateAngleX = 0.2F * MathHelper.sin(par3 * 0.3F) + 0.4F;
        this.Legbottom19.rotateAngleX = 0.2F * MathHelper.sin(par3 * 0.3F) + 0.4F;
        this.Legbottom20.rotateAngleX = 0.2F * MathHelper.sin(par3 * 0.3F) + 0.4F;
        this.Legbottom21.rotateAngleX = 0.2F * MathHelper.sin(par3 * 0.3F) + 0.4F;
        this.Legbottom22.rotateAngleX = 0.2F * MathHelper.sin(par3 * 0.3F) + 0.4F;
        this.Legbottom23.rotateAngleX = 0.2F * MathHelper.sin(par3 * 0.3F) + 0.4F;
        this.Legbottom24.rotateAngleX = 0.2F * MathHelper.sin(par3 * 0.3F) + 0.4F;
        this.Legbottom25.rotateAngleX = 0.2F * MathHelper.sin(par3 * 0.3F) + 0.4F;
    }
}
