# Quarantine Management EX2

## Comments on current code

### Things Done Well

The current class covers the basic functionality well, however, it lacks modularity and scalability options.

### Recommendations

Most comments about the differnt ways the program can be structued will be found in the other exercises, the current version can serve as a baseline case for the funtionality as the selection of the datastruture is appropriate.

### Introduce a `Person` Class

**Purpose**: To encapsulate all relevant details about an individual such as name, age, and contact information.
**Benefits**: Improves data management, facilitates future feature expansions, and enhances data validation and integrity.


### Possibility of Using a MAP
If there's a need to store additional information about each quarantined individual (such as the date of quarantine or specific conditions), using a HashMap or similar data structure could be more suitable.