// control/RandomBounds.java
// Math.random() 会产生0.0 和1.0 吗？
// {java RandomBounds lower}
import onjava.*;
public class RandomBounds {
public static void main(String[] args) {
new TimedAbort(3);
switch(args.length == 0 ? "" : args[0]) {
case "lower":
while(Math.random() != 0.0)
; // 保持重试
System.out.println("Produced 0.0!");
break;
case "upper":
while(Math.random() != 1.0)
; // 保持重试
System.out.println("Produced 1.0!");
break;
default:
System.out.println("Usage:");
System.out.println("\tRandomBounds lower");
System.out.println("\tRandomBounds upper");
System.exit(1);
}
}
}

