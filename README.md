# Solo Quest: My Shapes, Best Shapes
**`Quest giver: Grimand Talen`**
>Oof, great now I've done it!  Why won't this come out?...  Oh, who are you?  Never mind, come, come, I need you to fit this glass into this table.  You see, I have cut the glass with a few holes so that the lights can stick through the table but alas it is not working.  I have the locations of the spots on the table, but what I really need is to see if these spots would even fit into the glass shape before I do any cutting.  If you help me with this I will gladly create any furniture you would need.

## Objectives required to complete
This lab requires us to display our abilities for creating classes and using encapsulation.

One way we do this is by making the access level on our instance variables `private`.  This prevents other classes from seeing or using them unless they call a method to do so.

These instance variables, or fields, are the various states/properties our object has when it is created.  These are normally set via a constructor by passing in the values as arguments from another class `= new ClassName(argument1, argument2...)`.

Remember when setting values from parameters we always do `field_name = parameter_name`
```Java
public class Person {
  private String firstName;
  private String lastName;

  public Person (String pFirstName, String pLastName) {
    firstName = pFirstName;
    lastName = pLastName;
  }
}
```
```Java
public class Runner {
  public static void main(String[] args) {
    Person p1 = new Person("Phillip", "Fry");
  }
}
```

This code will create a new `Person` object called `p1`.  This object `p1` has a `firstName` value of `"Phillip"` and a `lastName` value of `"Fry"`.

Since we want to try to use some concepts of encapsulation we create "accessor" and "mutator" methods, more commonly known as setters and getters, to interact with the private instance variables.

Getters help us retrieve the value inside the private instance variable from another class.  Remember when making a getter you have to have a **return type that matches the data type of the instance variable**.

Getters **do not** have parameters, so blank ().  Getters only have a single line of code (for now) that is `return field_name;` where `field_name` is the instance variable you wish to return.

```Java
public class Person {
  private String firstName;
  private String lastName;

  public Person (String pFirstName, String pLastName) {
    firstName = pFirstName;
    lastName = pLastName;
  }

  public String getFirstName () {
    return firstName;
  }
}
```
```Java
public class Runner {
  public static void main(String[] args) {
    Person p1 = new Person("Phillip", "Fry");
    String first = p1.getFirstName();
  }
}
```

Opposite of getters we can create setters.  These methods allow us to change the value in an instance field from another class since we cannot directly access the instance variable itself.

Setters have a `void` return type as they are only modifying the variable not returning it.  Setters only have a single parameter, the parameter data type must match the data type of the field being modified.  Again setters also only have a single line of code (for now) `field_name = parameter_name`

```Java
public class Person {
  private String firstName;
  private String lastName;

  public Person (String pFirstName, String pLastName) {
    firstName = pFirstName;
    lastName = pLastName;
  }

  public String getFirstName () {
    return firstName;
  }

  public void setFirstName (String name) {
    firstName = name;
  }
}
```
```Java
public class Runner {
  public static void main(String[] args) {
    Person p1 = new Person("Phillip", "Fry");

    p1.setFirstName("Lola");
    String first = p1.getFirstName();
  }
}
```

In this example what we are doing in the `Runner` we are creating a Person object p1 to have the `firstName` Phillip and the `lastName` Fry.  However, we then use a setter to change the `firstName` from Phillip to Lola.  Therefore, when we use the getter method to retrieve the `firstName` we are getting back Lola and storing that into the string variable `first`.

## Objectives Required to complete
### Objective 1 - Designing a Plan
Our design plan should outline the steps being accomplished in each method of our program.  The [design example](designexample.txt) displays a design plan to base the one needed for this project.  When creating a design plan for this project it could be done in either a text file or as a comment on the top of a code file.  Remember design plans should be pushed and requested for approval before coding.

### Objective 2 - Cloning
- Clone this project into IntelliJ
    - remember to place it into a correct folder

### Objective 3 - Getting a Build Badge
It is possible to check the passing of your code from within IntelliJ.  We can discuss how to do that during office hours if needed.

To get this badge you will need to go to GitHub then get some code and paste that code into your README inside IntelliJ.

**On GitHub**
- Click on the "Actions" tab in the top section under your repo name
- Select the "GitHub Classroom Workflow" on the left-hand side
- Click on the "..." button that is next to the search bar on the page
    - Select "Create status badge" from the dropdown menu
- On the window, the pops open
    - Branch choose "main" from the options
    - Event choose "push" from the options
    - Click the green "Copy" button at the bottom of this page

**In IntelliJ**
- Open the README.md file by double-clicking on it from the "Project Panel"
- Paste your badge code at the very top
    - Make a new space at the top and paste it above everything else

Each time we make a push to GitHub the badge will update to show "Error", "failing", and "success" to let us know the status of our code against the unit tests written.

### Objective 4 - Branching from the main
- Click on the word "Git" in the bottom left corner of IntelliJ
    - Right-click on the word "main"
    - Choose "New branch from selected"
- On the popup name the branch `dev`
    - Leave the checkmark in "Checkout Branch"
    - Click "Create"

Now we have our `dev` branch, we double-check the bottom right corner it should say `dev`, not main.

We can now work on this `dev` branch.

## Quest Requirements
The bullet points in this section are the bare minimum needed.  There are often times when exact details are missing as it would give away the answer.  Therefore, we should realize that some more work and logic are required with certain steps.

Class and method names should be written as they are described below.  Variable names can be anything you choose as long as they follow naming conventions.
### Objective 1 - Completing MyRectangle Class
In this lab our class is already created we only need to fill it out with the appropriate information.

The main method and other parts of this class are run from the `MyShape` file.  **You do not or should not be changing anything in that file.**  It will fully run once you have completed `MyRectangle` correctly.  All these requirements are for the `MyRectangle` class.

- Create instance fields as `int` data types
    - `width`
        - for the X-dimension
    - `height`
        - for the Y-dimension
    - `startX`
        - the X-coordinate on the screen where the rectangle is being drawn from, this is the upper left corner of the rectangle
    - `startY`
        - the Y-coordinate on the screen where the rectangle is being drawn from, this is the upper left corner of the rectangle
- Create two constructors
    - one *default* constructor
        - set all instance variables to 0
    - one constructor that takes four parameters and initializes all instance fields to their values in order:
        - `startX`
        - `startY`
        - `width`
        - `height`
- Create setter and getter methods for each instance variable

Remember naming conventions when determining variable names.

### Objective 2 - Other MyRectangle Methods
We have other abilities that our MyRectangle class should achieve.

```Java
public int area()
```
- return the area of the given rectangle
- think about what you would need to do based on the instance variables you have access to
```Java
public String toString ()
```
- return the rectangle object's data in a user-friendly manner as such
    - `Width: ZZ Height: ZZ X: ZZ Y: ZZ`
    - The `ZZ`'s should be replaced with the particular values of that rectangle object
    - You do not want to hardcode in numbers so think about what you have access to and what the variable names are that could be helpful
```Java
public boolean isInisde (int X, int Y)
```
- return whether or not the given point (X,Y) falls within the rectangle
- This should be planned out with paper and pencil first as it can be tricky
 ```Java
 public void setSize (int newWidth, int newHeight)
 ```
- changes the width and height of the rectangle to be the values that are passed in
- no return
```Java
void setPosition (int newX, int newY)
```
- change the X and Y position of the rectangle with the new values passed in
- no return

### Objective 3 - Run Main Method
With all of the code finished in the `MyRectangle` class we can run the main method in the `MyShape` class.

You can check your output against the [sample](/sample-output/myshapebestshapeout.txt).  If all the test cases I wrote for you pass then your output will match

### Objective 4 - Merging to the main branch and Pushing
- Click on the word "Git" in the bottom left corner of IntelliJ
- Select "main" (it should only say main)
    - Right-click and select "Checkout"
- It should now say "main" in the bottom right corner
- main should also have the checkout tag on it in this "Git" window
- Select the "dev" branch in this Git window
    - Right-click and select "Merge Selected into Current"
- Put a checkmark in the `dev` option
    - The checkmark might not be an option, if it is not that is acceptable
    - Only select the `dev` branch with no other words as this is our local version
- Click the merge button

### Objective 5 - Pushing back to GitHub
- Push all your commits to GitHub on both the main, dev, and any other branches you make
    - It does not hurt to do a final "add and commit" before pushing to verify the latest version is up on GitHub

The committing and pushing process does not change for different branches it is always the same.  If you are confused or struggling with this process please reach out and let me know.

**Note:** Only the code on the main branch will be graded.  It is important to make sure you are happy with your main branch.  You can check if your code is only GitHub by logging in, finding your repo based on the assignment, and checking the commit messages on the page that loads.  These are in the middle column of the little box at the top.  You should see your most recent commit message next to whatever files/folder you pushed.

#### Grading
|   Points     |   Requirement                               |
| :----------: |:------------------------------------------- |
| 2.5          | constructors work correctly                 |
| 2.5          | area method works correctly                 |
| 2.5          | isInside method works correctly             |
| 2.5          | "set" methods work correctly                |
