package com.genericutility;

import java.util.Random;

public class JavaUtility {

public int getRandomNo() {
Random r=new Random();
int ran=r.nextInt(500);
return ran;
	}

}
