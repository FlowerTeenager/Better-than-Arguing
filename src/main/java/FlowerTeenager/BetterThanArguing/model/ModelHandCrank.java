package FlowerTeenager.BetterThanArguing.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelHandCrank extends ModelBase
{
  //fields
    ModelRenderer Base;
    ModelRenderer Shaft;
  
  public ModelHandCrank()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Base = new ModelRenderer(this, 0, 0);
      Base.addBox(0F, 0F, 0F, 16, 4, 16);
      Base.setRotationPoint(-8F, 20F, -8F);
      Base.setTextureSize(64, 32);
      Base.mirror = true;
      setRotation(Base, 0F, 0F, 0F);
      Shaft = new ModelRenderer(this, 0, 0);
      Shaft.addBox(0F, 0F, 0F, 2, 12, 2);
      Shaft.setRotationPoint(-1F, 9F, -1F);
      Shaft.setTextureSize(64, 32);
      Shaft.mirror = true;
      setRotation(Shaft, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Base.render(f5);
    Shaft.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
  }

}
