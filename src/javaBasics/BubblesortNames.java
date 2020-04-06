package javaBasics;

import java.util.ArrayList;

public class BubblesortNames {

public static void main(String[] args) {
// TODO Auto-generated method stub
ArrayList<String> names = new ArrayList<String>();
names.add("Fedor");
names.add("Leo");
names.add("Basti");
names.add("Martin");
names.add("Martina");
names.add("Chemmy");
names.add("Oleg");

for (int j = 0; j < names.size()- 1; j++) { 
for (int i = 0; i < names.size() - 1; ++i) { 
if (names.get(i).compareTo(names.get(i + 1))>0) { 

String temporary = names.get(i);
names.set(i, names.get(i+1));
names.set(i+1, temporary);
}
}
}
System.out.print(names);
}

}
