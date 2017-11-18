package com.sware.general;

import com.sware.general.Base.BaseInner;

class Base{
	private String baseClassName="baseClass Private variable";
	
	class BaseInner{
		String name;
		public BaseInner(){
			this.name=baseClassName;
		}
		void accessOuterclassPrivateFields(){
			System.out.println("baseClassName :"+baseClassName);
		}
	}
}


/*class Child extends BaseInner{
	
}*/

public class InnerClassExample {
	
	public static void main(String[] args) {
		Base b=new Base();
		BaseInner inner=b.new BaseInner();
		
		inner.accessOuterclassPrivateFields();
		System.out.println(inner.name);
	}

}
