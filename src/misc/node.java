package misc;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class node {
	
	List<node> depededon;
	List<node> otherdepends;
	String name;
	int status;
	HashMap<String,node> map;
	
	node(String nameof)
	{
		this.name = nameof;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Code for reading line by line, 
		//Calling Install when install is Operation. 
		//Calling add dependencies when DEPENDS is there as operation
		//Calling Uninstall when UNINSTALL is there as operation.
		while(true)
		{
			System.out.println("Enter Input");
			Scanner sc=new Scanner(System.in);
			String op = sc.nextLine();
			String[] ags = op.split(" ");
			if(ags[0]=="DEPENDS")
			{
				
			}
		}
		

	}
	
	/// The problem with this approach is that if there are loops it will not be able to proceed further.
	
	public void install(String x)
	{
		node i = map.get(x);
		
		for(int j=0;j<i.depededon.size();j++)
		{
			node l = depededon.get(j);
			if(l.status != 1)
			{
				System.out.println("Installing " + l.name);
				install(l.name);
				l.status  = 1;	
			}
		}
	}
	
	public void uninstall(String x)
	{
		node i = map.get(x);
		for(int j=0;j<otherdepends.size();j++)
		{
			node l = otherdepends.get(j);
			if(l.status == 1)
			{
				System.out.println("STILL IN USE");
				return;
			}
		}
		System.out.println("Uninstalling" + x);
		i.status = 0;
	}
	public void addDependencies(String[] dependencies)
	{
		if(!map.containsKey(dependencies[0])){
			map.put(dependencies[0],new node(dependencies[0]));
			node x = map.get(dependencies[0]);
			for(int i=1;i<dependencies.length;i++)
			{
				if(!map.containsKey(dependencies[i])){
					map.put(dependencies[i],new node(dependencies[i]));
					node j = map.get(dependencies[i]);
					j.otherdepends.add(x);
					x.depededon.add(j);
				}
				else
				{
					node j = map.get(dependencies[i]);
					j.otherdepends.add(x);
					x.depededon.add(j);
				}
			}
		}
	}

}
