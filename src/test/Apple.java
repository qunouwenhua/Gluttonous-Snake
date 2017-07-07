package test;

import test.FruitColor.Color;

public class Apple {

	@FruitName("Apple\n36￥")
	private String appleName;
	
	@FruitColor(fruitColor=Color.红)
	private String appleColor;
	
	@FruitProvider(id=1,name="oppo",address="深圳后海")
	private String appleProvider;

	public String getAppleName() {
		return appleName;
	}

	public void setAppleName(String appleName) {
		this.appleName = appleName;
	}

	public String getAppleColor() {
		return appleColor;
	}

	public void setAppleColor(String appleColor) {
		this.appleColor = appleColor;
	}

	public String getAppleProvider() {
		return appleProvider;
	}

	public void setAppleProvider(String appleProvider) {
		this.appleProvider = appleProvider;
	}
}
