# geeksforgeek-solution
## Learn with Shivaraj

#### Here's a Java loops cheat sheet to help you solve coding problems efficiently:

### 1. `for` Loop:
```java
for (initialization; condition; update) {
    // code block
}
```
- **Initialization**: Initialize loop variable(s).
- **Condition**: Continue loop execution as long as this condition is true.
- **Update**: Modify loop variable(s) after each iteration.

**Example:**
```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

### 2. Enhanced `for` Loop (for-each):
```java
for (type variable : array/collection) {
    // code block
}
```
- **Type**: Data type of elements in the array or collection.
- **Variable**: Temporary variable to hold each element during iteration.

**Example:**
```java
int[] numbers = {1, 2, 3, 4, 5};
for (int num : numbers) {
    System.out.println(num);
}
```

### 3. `while` Loop:
```java
while (condition) {
    // code block
}
```
- **Condition**: Loop executes as long as this condition is true.

**Example:**
```java
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}
```

### 4. `do-while` Loop:
```java
do {
    // code block
} while (condition);
```
- **Code block**: Executes at least once before checking the condition.
- **Condition**: Loop continues as long as this condition is true.

**Example:**
```java
int i = 0;
do {
    System.out.println(i);
    i++;
} while (i < 5);
```

### Loop Control Statements:
- **`break`**: Exit loop immediately.
- **`continue`**: Skip current iteration and proceed to the next iteration.
- **`return`**: Exit loop and the enclosing method (applicable within methods).

**Example (`break`):**
```java
for (int i = 0; i < 5; i++) {
    if (i == 3) {
        break;
    }
    System.out.println(i);
}
```

**Example (`continue`):**
```java
for (int i = 0; i < 5; i++) {
    if (i == 3) {
        continue;
    }
    System.out.println(i);
}
```
#### Here's a cheat sheet for working with strings in Java:

### 1. String Declaration and Initialization:
```java
String str = "Hello, World!";
```

### 2. String Length:
```java
int length = str.length();
```

### 3. Accessing Characters:
```java
char firstChar = str.charAt(0); // Access first character
```

### 4. Concatenation:
```java
String newStr = str + " Welcome!";
```
Or by using the `concat()` method:
```java
String newStr = str.concat(" Welcome!");
```

### 5. Substring:
```java
String subStr = str.substring(startIndex);
String subStr = str.substring(startIndex, endIndex);
```

### 6. String Comparison:
```java
boolean isEqual = str.equals(anotherString);
boolean isEqualIgnoreCase = str.equalsIgnoreCase(anotherString);
```

### 7. Case Conversion:
```java
String upperCaseStr = str.toUpperCase();
String lowerCaseStr = str.toLowerCase();
```

### 8. String Splitting:
```java
String[] parts = str.split(delimiter);
```

### 9. Trimming:
```java
String trimmedStr = str.trim();
```

### 10. Searching:
```java
int index = str.indexOf(subStr);
int lastIndex = str.lastIndexOf(subStr);
boolean contains = str.contains(subStr);
```

### 11. Replacing:
```java
String replacedStr = str.replace(oldChar, newChar);
String replacedStr = str.replace(oldStr, newStr);
```

### 12. Formatting:
```java
String formattedStr = String.format(format, args);
```

### 13. Converting to/from Primitive Types:
```java
int intValue = Integer.parseInt(str);
double doubleValue = Double.parseDouble(str);
String strValue = String.valueOf(intValue);
```

### 14. Checking Empty or Null:
```java
boolean isEmpty = str.isEmpty();
boolean isNull = str == null;
```

### 15. Building Strings Efficiently:
```java
StringBuilder sb = new StringBuilder();
sb.append("Hello");
sb.append(" World!");
String result = sb.toString();
```

### 16. Immutable vs. Mutable:
- Strings are immutable (unchangeable). Operations like concatenation create new strings.
- Use `StringBuilder` or `StringBuffer` for mutable string operations.

#### Here's a cheat sheet for working with HashMap in Java:

### 1. HashMap Declaration and Initialization:
```java
HashMap<KeyType, ValueType> map = new HashMap<>();
```

### 2. Adding Key-Value Pairs:
```java
map.put(key, value);
```

### 3. Accessing Value by Key:
```java
ValueType value = map.get(key);
```

### 4. Checking if Key Exists:
```java
boolean containsKey = map.containsKey(key);
```

### 5. Removing Key-Value Pairs:
```java
map.remove(key);
```

### 6. Checking if Value Exists:
```java
boolean containsValue = map.containsValue(value);
```

### 7. Getting Size:
```java
int size = map.size();
```

### 8. Iterating Through HashMap:
```java
for (Map.Entry<KeyType, ValueType> entry : map.entrySet()) {
    KeyType key = entry.getKey();
    ValueType value = entry.getValue();
    // Process key-value pair
}
```

### 9. Checking if HashMap is Empty:
```java
boolean isEmpty = map.isEmpty();
```

### 10. Clearing HashMap:
```java
map.clear();
```

### 11. Getting Keys or Values as Collection:
```java
Set<KeyType> keys = map.keySet(); // Returns a Set of keys
Collection<ValueType> values = map.values(); // Returns a Collection of values
```

### 12. HashMap Resize:
- HashMap automatically resizes itself when the load factor exceeds a threshold (default load factor is 0.75).

### 13. HashMap with Initial Capacity and Load Factor:
```java
HashMap<KeyType, ValueType> map = new HashMap<>(initialCapacity, loadFactor);
```

### 14. HashMap Iteration with forEach():
```java
map.forEach((key, value) -> {
    // Process key-value pair
});
```

### 15. HashMap Merging:
```java
map.merge(key, newValue, (oldValue, newValue) -> oldValue + newValue);
```

### 16. HashMap Replace All:
```java
map.replaceAll((key, value) -> value.toUpperCase());
```

### 17. HashMap Compute Methods:
```java
map.compute(key, (k, v) -> v + 1);
map.computeIfAbsent(key, k -> someFunction(k));
map.computeIfPresent(key, (k, v) -> someFunction(k, v));
```
#### Here's a cheat sheet for working with HashSet in Java:

### 1. HashSet Declaration and Initialization:
```java
HashSet<ElementType> set = new HashSet<>();
```

### 2. Adding Elements:
```java
set.add(element);
```

### 3. Removing Elements:
```java
set.remove(element);
```

### 4. Checking if Element Exists:
```java
boolean containsElement = set.contains(element);
```

### 5. Getting Size:
```java
int size = set.size();
```

### 6. Iterating Through HashSet:
```java
for (ElementType element : set) {
    // Process element
}
```

### 7. Checking if HashSet is Empty:
```java
boolean isEmpty = set.isEmpty();
```

### 8. Clearing HashSet:
```java
set.clear();
```

### 9. Converting HashSet to Array:
```java
ElementType[] array = set.toArray(new ElementType[0]);
```

### 10. HashSet Union, Intersection, Difference:
- **Union** (combine two sets):
  ```java
  set1.addAll(set2);
  ```

- **Intersection** (elements common to both sets):
  ```java
  set1.retainAll(set2);
  ```

- **Difference** (elements present in set1 but not in set2):
  ```java
  set1.removeAll(set2);
  ```

### 11. HashSet Conversion to Other Collections:
```java
List<ElementType> list = new ArrayList<>(set);
```

### 12. HashSet Copying:
```java
HashSet<ElementType> copySet = new HashSet<>(set);
```

### 13. HashSet with Initial Capacity and Load Factor:
```java
HashSet<ElementType> set = new HashSet<>(initialCapacity, loadFactor);
```

### 14. HashSet Iteration with forEach():
```java
set.forEach(element -> {
    // Process element
});
```

### 15. HashSet Retain All (Intersection):
```java
boolean changed = set1.retainAll(set2);
```

### 16. HashSet Comparison:
```java
boolean isEqual = set1.equals(set2);
```
#### Here's a cheat sheet for working with lists in Java, particularly focusing on the `List` interface and its implementations like `ArrayList` and `LinkedList`:

### 1. List Declaration and Initialization:
```java
List<ElementType> list = new ArrayList<>(); // ArrayList
List<ElementType> list = new LinkedList<>(); // LinkedList
```

### 2. Adding Elements:
```java
list.add(element); // Adds at the end
list.add(index, element); // Adds at specified index
```

### 3. Removing Elements:
```java
list.remove(element); // Removes the first occurrence
list.remove(index); // Removes element at specified index
```

### 4. Accessing Elements:
```java
ElementType element = list.get(index); // Retrieves element at specified index
```

### 5. Checking if List Contains Element:
```java
boolean containsElement = list.contains(element);
```

### 6. Getting Size:
```java
int size = list.size();
```

### 7. Iterating Through List:
```java
for (ElementType element : list) {
    // Process element
}
```

### 8. Checking if List is Empty:
```java
boolean isEmpty = list.isEmpty();
```

### 9. Clearing List:
```java
list.clear();
```

### 10. Converting List to Array:
```java
ElementType[] array = list.toArray(new ElementType[0]);
```

### 11. Sublist:
```java
List<ElementType> subList = list.subList(fromIndex, toIndex);
```

### 12. Adding All Elements of Another Collection:
```java
list.addAll(anotherList);
```

### 13. Removing All Elements Present in Another Collection:
```java
list.removeAll(anotherList);
```

### 14. Retaining Only Elements Present in Another Collection:
```java
list.retainAll(anotherList);
```

### 15. Sorting List:
```java
Collections.sort(list); // Sorts elements in natural order
```

### 16. Reversing List:
```java
Collections.reverse(list);
```

### 17. Checking Equality of Lists:
```java
boolean isEqual = list1.equals(list2);
```

### 18. List Iteration with forEach():
```java
list.forEach(element -> {
    // Process element
});
```

### 19. List Copying:
```java
List<ElementType> copyList = new ArrayList<>(list);
```

#### Here's a cheat sheet for working with stacks in Java:

### 1. Stack Declaration and Initialization:
```java
Stack<ElementType> stack = new Stack<>();
```

### 2. Pushing Elements onto the Stack:
```java
stack.push(element);
```

### 3. Popping Element from the Stack:
```java
ElementType poppedElement = stack.pop();
```

### 4. Peeking at the Top Element:
```java
ElementType topElement = stack.peek();
```

### 5. Checking if Stack is Empty:
```java
boolean isEmpty = stack.isEmpty();
```

### 6. Getting Size of the Stack:
```java
int size = stack.size();
```

### 7. Searching for an Element:
```java
int position = stack.search(element);
```
- Returns the 1-based position of the element from the top of the stack, or -1 if not found.

### 8. Iterating Through the Stack (Note: StackIterator is not part of standard Java API):
```java
Iterator<ElementType> iterator = stack.iterator();
while (iterator.hasNext()) {
    ElementType element = iterator.next();
    // Process element
}
```

### 9. Clearing the Stack:
```java
stack.clear();
```
#### Here's a cheat sheet for working with queues in Java:

### 1. Queue Declaration and Initialization:
```java
Queue<ElementType> queue = new LinkedList<>(); // LinkedList implementation
```

### 2. Adding Elements to the Queue:
```java
queue.add(element); // Throws exception if queue is full
queue.offer(element); // Returns false if queue is full
```

### 3. Removing and Retrieving the Head of the Queue:
```java
ElementType headElement = queue.remove(); // Throws exception if queue is empty
ElementType headElement = queue.poll(); // Returns null if queue is empty
```

### 4. Retrieving, but Not Removing, the Head of the Queue:
```java
ElementType headElement = queue.element(); // Throws exception if queue is empty
ElementType headElement = queue.peek(); // Returns null if queue is empty
```

### 5. Checking if Queue is Empty:
```java
boolean isEmpty = queue.isEmpty();
```

### 6. Getting Size of the Queue:
```java
int size = queue.size();
```

### 7. Iterating Through the Queue (Note: QueueIterator is not part of standard Java API):
```java
Iterator<ElementType> iterator = queue.iterator();
while (iterator.hasNext()) {
    ElementType element = iterator.next();
    // Process element
}
```

### 8. Clearing the Queue:
```java
queue.clear();
```

### 9. Removing a Specific Element from the Queue:
```java
boolean removed = queue.remove(element); // Removes the first occurrence of the element
```

### 10. Checking if Queue Contains a Specific Element:
```java
boolean containsElement = queue.contains(element);
```

### 11. Conversion to Array:
```java
ElementType[] array = queue.toArray(new ElementType[0]);
```

### 12. Conversion to List (Note: QueueToListConverter is not part of standard Java API):
```java
List<ElementType> list = QueueToListConverter.toList(queue);
```

### 13. Priority Queue Declaration and Initialization:
```java
Queue<ElementType> priorityQueue = new PriorityQueue<>(); // Default (natural) ordering
Queue<ElementType> priorityQueue = new PriorityQueue<>(Comparator); // With custom Comparator
```
