# Quarantine Management EX3

## Comments on current code

### Things Done Well
**Attributes**: Utilizes `String` for name and `int` for id, appropriate for representing a person's identity.
**ID Handling**: Uses a static integer to manage unique IDs which is straightforward but not thread-safe.

### Improvements
**Additional Functionality**: Methods to remove persons or to clear the quarantine could enhance manageability.

## Conclusion
The classes are well-implemented with respect to the basic functionalities of handling persons and managing a quarantine. However, enhancements regarding thread safety, method naming, and additional functionality could further improve the robustness and clarity of the implementation.