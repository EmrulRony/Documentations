## JavaScript

**<u>Variables</u>**

JavaScript variables are containers for storing data values.

In this example, `x`, `y`, and `z`, are variables:

```javascript
var x = 5;
var y = 6;
var z = x + y;
```

**<u>Data types</u>**

JavaScript variables can hold many **data types**: numbers, strings, objects and more:

```javascript
var length = 16;                               // Number
var lastName = "Johnson";                      // String
var x = {firstName:"John", lastName:"Doe"};    // Object
```



**<u>This</u>**

- In a method, `this` refers to the owner object.
- Alone, `this` refers to the global object.
- In a function, `this` refers to the global object.

 ```javascript
// in a method
var person = {
  firstName: "John",
  lastName : "Doe",
  id       : 5566,
  fullName : function() {  // this refers to the owners object
    return this.firstName + " " + this.lastName;
  }
};
// in a function
function myFunction() {
  return this; // this refers to the [object window]
}

// in an event
<button onclick="this.style.display='none'">
  Click to Remove Me!
</button>

 ```

**<u>Let</u>**

ES2015 introduced two important new JavaScript keywords: `let` and `const`.These two keywords provide **Block Scope** variables (and constants) in JavaScript.

```javascript
{
  var x = 2;
}
// x CAN be used here

```

```javascript
{
  let x = 2;
}
// x can NOT be used here
```

<u>**Const**</u>

- Variables defined with `const` behave like `let` variables, except they cannot be reassigned

```javascript
const PI = 3.141592653589793;
PI = 3.14;      // This will give an error
PI = PI + 10;   // This will also give an error
```

- Declaring a variable with `const` is similar to `let` when it comes to **Block Scope**.
- JavaScript `const` variables must be assigned a value when they are declared
- If we assign a primitive value to a constant, we cannot change the primitive value
- You can change the properties of a constant object.

```javascript
// You can create a const object:
const car = {type:"Fiat", model:"500", color:"white"};

// You can change a property:
car.color = "red";

// You can add a property:
car.owner = "Johnson";
```

- But you can NOT reassign a constant object

```javascript
const car = {type:"Fiat", model:"500", color:"white"};
car = {type:"Volvo", model:"EX60", color:"red"};    // ERROR
```

- You can change the elements of a constant array.But you can NOT reassign a constant array

**<u>Arrow Function</u>**

Arrow functions were introduced in ES6.

Arrow functions allow us to write shorter function syntax

```javascript
// Before ES6
hello = function() {
  return "Hello World!";
}
// After
hello = () => {
  return "Hello World!";
}
// With parameter
hello = (val) => "Hello " + val;
```

Arrow function return value by default

#### <u>JavaScript OOP</u>

**<u>Objects</u>**

In JavaScript, almost "everything" is an object.

- Booleans can be objects (if defined with the `new` keyword)
- Numbers can be objects (if defined with the `new` keyword)
- Strings can be objects (if defined with the `new` keyword)
- Dates are always objects
- Maths are always objects
- Regular expressions are always objects
- Arrays are always objects
- Functions are always objects
- Objects are always objects

**Object properties**

- Objects are variables too but they can contain many value 
- Objects can contain methods
- Methods are **actions** that can be performed on objects

```javascript
var person = {
  firstName: "John",
  lastName : "Doe",
  id       : 5566,
  fullName : function() { //Object method
    return this.firstName + " " + this.lastName;
  }
};

// Modify object property
person.firstName = "Emrul";
// Adding object property
person.nationality = "Bangladeshi";
// Accessing object methods
document.getElementById("demo").innerHTML = person.fullName;
```

- Iterating over an object

```javascript
var x, txt = "";
var person = {name:"John", age:30, city:"New York"};

for (x in person) {
txt += person[x] + " ";
};

document.getElementById("demo").innerHTML = text;
```

**<u>Object Constructor</u>**

Sometimes we need a "**blueprint**" for creating many objects of the same "type". The way to create an "object type", is to use an **object constructor function**.

- It is considered good practice to name constructor functions with an upper-case first letter.
- You can not add a new property to an existing object constructor

```javascript
// Constructor function for Person objects
function Person(first, last, age, eye) {
  this.firstName = first;
  this.lastName = last;
  this.age = age;
  this.eyeColor = eye;
}

// Create two Person objects
var myFather = new Person("John", "Doe", 50, "blue");
var myMother = new Person("Sally", "Rally", 48, "green");
```

**<u>Prototype inheritance</u>**

All JavaScript objects inherit properties and methods from a prototype:

- `Date` objects inherit from `Date.prototype`
- `Array` objects inherit from `Array.prototype`
- `Person` objects inherit from `Person.prototype`

The `Object.prototype` is on the top of the prototype inheritance chain:

`Date` objects, `Array` objects, and `Person` objects inherit from `Object.prototype`.

Sometimes you want to add new properties (or methods) to all existing objects of a given type. Sometimes you want to add new properties (or methods) to an object constructor.

Using prototype we can do so....

```javascript
function Person(first, last, age, eye) {
  this.firstName = first;
  this.lastName = last;
  this.age = age;
  this.eyeColor = eye;
}

Person.prototype.name = function() {
  return this.firstName + " " + this.lastName
};
```

**<u>JS Functions</u>**

Way of declaring a function

```javascript
function myFunction(a, b) {return a * b}
```

Anonymous function:

 ```java
var myFunction = function (a, b) {return a * b}
 ```

Callback function:

A callback function is a function passed into another function as an argument, which is then invoked inside the outer function to complete some kind of routine or action.

```javascript
function greeting(name) {
  alert('Hello ' + name);
}

function processUserInput(callback) {
  var name = prompt('Please enter your name.');
  callback(name);
}

processUserInput(greeting);
```

