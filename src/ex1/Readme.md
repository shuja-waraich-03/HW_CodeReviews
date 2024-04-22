# Twitter EX1

## Comments on current code

### Things Done Well

Method Naming has been done approporiately
Constructer and Class Structure is easy and intuitive

### Aread of Improvement and Suggestion:
Encapsulation: Direct manipulation of another user's followerCount inside the follow method can lead to issues if the method is modified incorrectly. This violates the encapsulation principle where object data should only be modified by the object's own methods.

Suggestion: Implement methods like addFollower(User u) and addFollowing(User u) within the User class that handle these increments internally. This would keep the increase or decrease of counts within the object itself, maintaining encapsulation.

Redundancy and Error Handling: The current methods lack checks for null values and do not handle possible exceptions that might occur when a null user is passed.

Suggestion: Add null checks before performing operations on user objects to avoid NullPointerException.


## Other Possible Improvements:

### Using a HashSet instead of an ArrayList

Performance: HashSet provides faster performance for common operations such as add, remove, and contains. These operations generally run in constant time (O(1)) for HashSet, compared to linear time (O(n)) for ArrayList. This is particularly beneficial as the number of followers or following grows, ensuring that the system remains efficient even with large data sets.

Automatic Duplicate Handling: HashSet automatically prevents duplicates because it only allows unique elements. When managing followers and following, you typically want to ensure that no user is followed or listed twice. HashSet enforces this rule without any additional code, whereas with ArrayList, you would have to explicitly check for the existence of an element before adding it to avoid duplication.