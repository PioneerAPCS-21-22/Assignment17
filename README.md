# Assignment 17

Use `Math.random()` to generate a random number in a range given by the user (exclusive) in order to simulate the roll of a die. Then, ask the user to guess the roll and tell them if they guessed correctly. If they guessed incorrectly, tell them if they were high or low and what the actual roll was.

You must account for edge cases (if user enters a number outside of the range) and you can use one class for this assignment, but you must use at least one method.

### Random Numbers Examples

For some random integer n, where `x <= n <= y`:

`int n = (int) ((y - x + 1) * Math.random() + x);`

In basic terms, (y - x + 1) is the number of possible integers you want to generate.

x is the minimum value, so it adjusts it from the minimum value from `Math.random()`, which is zero.

### Sample Outputs

```
Bottom of range? 5
Top of range? 20
Pick a number between 5 and 20: 12
You are too low. The number is 15
```

```
Bottom of range? 0
Top of range? 11
Pick a number between 0 and 11: 10
You are too high. The number is 1
```

```
Bottom of range? 1
Top of range? 50
Pick a number between 1 and 50: 25
You are correct!
```

```
Bottom of range? 5
Top of range? 25
Pick a number between 5 and 25: 5
Invalid input. You lose!
```

### Grading

As always, your program will be graded on its functionality according to the project specifications and proper code style.

