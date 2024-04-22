# Quarantine Management EX4

## Comments on current code

### Things Done Well
The method addPatient ensures no duplicate entries, which is good. However, A HashSet would have been a better option here.

The Person Class is simple and focused while cotaining all necessary funtionality.

### Improvements
**Replace LinkedList** with a more appropriate data structure based on the intended operations.
**Consolidate the similar print methods** into a single method that accepts a status parameter.
Use **Enum** for status to improve type safety and clarity.

### Other Possible Improvements
**Using Global Variables** to Track Counts instead of checking the count through a for loop everytime, this will ensure that for large list the excessive iterations can be avoided

### Alternatively
**Use Multiple Sets** Maintain separate HashSets for each status to track IDs. This way we could use the size method for the Sets to check the number of each type of person and achieve O(1) performance.


## Conclusion
By adopting these recommendations, the system can achieve greater efficiency, robustness, and clarity, ultimately leading to improved manageability and reliability of quarantine status tracking