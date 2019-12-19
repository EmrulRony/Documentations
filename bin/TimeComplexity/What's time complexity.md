**What's time complexity?**

Time complexity describes the amount of time an algorithm takes for a set of input to process.

In computer science we usually compute the worst-case time complexity. That means, maximum amount of time an algorithm can take for a set of input. 

Usually we express time complexity using Big O notation and the typical time complexities are O(1), O(n), O(n^2), O(log n), O (n log n), etc. ( considering n is the input size )

**Operations that cause an algorithm to take time** 

1. Assignment operation ( a=b )
2. Comparison operation ( a>b, a==b, etc. )
3. Arithmetic operation  ( a+b )
4. Calling a function ( obj.function() )
5. Working inside function ( return, break, etc. )

**Constant or O(1)** 

If the execution time of an algorithm doesn't depend on the input size, the time complexity of the algorithm is O(1). 

```java
	public int func(int input){
        int total = 5;
        return total;
    }
```

In the above function, regardless of the input size the number of operations inside the function will remain same. So, we can say that the time complexity of the above function is O(1).

![](C:\Users\Sarowar-221\Desktop\save (1).png)

**Linear or O(n)**

Time complexity of an algorithm is said to be O(n) if the number of operations it performs increases linearly with the input size.

```java
	public int func(int input){
        int total = 0;
        for (int i=1; i<=input; i++){
            total++;
        }
        return total;
    }
```

In the above example, the iteration of the loop and the assignment of the variable total depends on the inputs size and the number of operations increases linearly with the increasing value of input. So, it can be said that the time complexity of this function is O(n). 

![](C:\Users\Sarowar-221\Desktop\save 2.png)

**Quadratic or O(*n^2*)**

If the number of operations an algorithm performs increases quadratically then we can say that the time complexity of that algorithm is O(*n^2*). 

```java
	public int func(int input){
        int total = 0;
        for (int i=1; i<=input; i++){
            for (int j=input; j>=i ; j--){
                total +=i;
            }
        }
        return total;
    }
```

In the above function, we are dealing with two for loops. The iteration of the outer loop depends on the input size and its operations increases linearly. So, the time complexity of the of the outer loop is O(n). Similarly, we as the iteration of the inner loop also depends on the value of input, the time complexity of the outer loop is also O(n). As it it's a nested loop, we can say the time complexity of the function is,

=> O(n) * O(n)
=> O(n^2)

![](C:\Users\Sarowar-221\Desktop\save (4).png)

