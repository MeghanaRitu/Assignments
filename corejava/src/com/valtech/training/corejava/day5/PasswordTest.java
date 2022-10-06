package com.valtech.training.corejava.day5;



import static org.junit.Assert.*;



import java.util.Arrays;



import org.junit.Test;



public class PasswordTest {



   @Test
    public void checklower() {
        Password lwr=new Password();
            assertEquals(true, lwr.checklower("abcdefgh"));
            }
   @Test
    public void uppertest() {
    Password upr=new Password();
    assertEquals(true, upr.checkupper("ABCDEFGH"));
   }
   
   @Test
   public void specialtest() {
   Password spl=new Password();
   assertEquals(5, spl.checkspecialchar("@"));
  }
   @Test
   public void numbertest() {
   Password num=new Password();
   assertEquals(true, num.isNumber('1'));}
   @Test
   public void test() {
	   String s="Megha@2349";
		Password pc=new Password();
		assertEquals(23, pc.checker(s));
		}
	
  }
   
 