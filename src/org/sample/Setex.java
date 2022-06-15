package org.sample;
import java.util.*;

public class Setex
{
public static void main(String[] args)
{
	Set<Object> s=new LinkedHashSet<>();
	s.add(30);
	s.add("Priya");
	s.add('F');
	s.add("9677408056");
	for (Object x: s)
	{
		System.out.println(x);
	}
	String a="java";
	String  b=new String("java");
	System.out.println(a==b);
}
}
