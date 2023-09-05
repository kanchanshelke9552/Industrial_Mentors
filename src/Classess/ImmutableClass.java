package Classess;

final class Immutable{
 private final int id;
 private final String name;

 public Immutable(int id, String name) {
  this.id = id;
  this.name = name;
 }

 public int getId() {
  return id;
 }

 public String getName() {
  return name;
 }
}
public class ImmutableClass {
 public static void main(String[] args) {
  Immutable im=new Immutable(101,"kanchan");
//  im=new Immutable(202,"sagar");
  System.out.println(im.getId()+" "+im.getName());
 }
}
