# Table of Contents

1. [User Input](https://github.com/ssm0801/DSA-using-Java/blob/master/Java_Basics/InputOutput.java)
2. [Array](https://github.com/ssm0801/DSA-using-Java/blob/master/Java_Basics/Array.java)
3. [Enhanced Switch Case](https://github.com/ssm0801/DSA-using-Java/blob/master/Java_Basics/EnhancedSwitch.java)
4. [Functions](https://github.com/ssm0801/DSA-using-Java/blob/master/Java_Basics/Functions.java)
5. [Pass by value](https://github.com/ssm0801/DSA-using-Java/blob/master/Java_Basics/PassByValue.java)
6. [Pass by reference](https://github.com/ssm0801/DSA-using-Java/blob/master/Java_Basics/PassByReference.java)

## User Input

```java
// integer related
byte a = scanner.nextByte();
short b = scanner.nextShort();
int c = scanner.nextInt();
long d = scanner.nextLong();

// decimal related
float e = scanner.nextFloat();
double f = scanner.nextDouble();

// string related
// next will take first word only
char g = scanner.next().charAt(0);
// nextLine will read entire line until it finds new line separator
String h = scanner.next();
```

## Arrays

**Different ways to declare 1D array**

```java
int arr[] = {1, 2, 3, 4, 5};

int[] arr = {1, 2, 3, 4, 5};

int[] arr = new int[] {1, 2, 3, 4, 5};

// default values will be 0
int[] arr = new int[5];
```

**Different ways to declare 2D array**

```java
int[][] arr = {{1, 2}, {3, 4, 5}};

int[][] arr = new int[][] {{1, 2, 3}, {4}, {5}};

// default values will be 0
int[][] arr = new int[5][4];

// won't have default values, all 3 rows will be null
int[][] arr = new int[3][];
```

**Print Array**

- To print array we can use `toString` function from `Arrays`

```java
import java.util.Arrays;

System.out.println(Arrays.toString(arr));
```

## Enhanced Switch Case

```java
switch (num) {
    case 1 -> System.out.println("Sunday");
    case 2 -> System.out.println("Monday");
    case 3 -> System.out.println("Tuesday");
    case 4 -> System.out.println("Wednesday");
    case 5 -> System.out.println("Thursday");
    case 6 -> System.out.println("Friday");
    case 7 -> System.out.println("Saturday");
    default -> System.out.println("Invalid input");
}
```

## Function

- Non-static function can reference static and non-static context
- Static function can only reference static context
- Static functions can be called using class name

## Pass by value & reference

- Java strictly have pass by value only
- For objects (including array) gives illusion of pass by reference
