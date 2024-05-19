# Java collections

![alt text](image.png)

0. interface Iterable

![alt text](image-1.png)

1. interface Collection

![alt text](image-2.png)

2. interface Set

![alt text](image-3.png)

3. interface List

![alt text](image-4.png)

4. interface Queue

![alt text](image-5.png)

5. class HashSet

![alt text](image-6.png)

6. class LinkedHashSet

![alt text](image-7.png)

7. class ArrayList

![alt text](image-8.png)

8. class Vector

![alt text](image-9.png)

9. class Stack

![alt text](image-10.png)

10. class LinkedList

![alt text](image-11.png)

11. interface Deque

![alt text](image-12.png)

12. interface SortedSet

![alt text](image-17.png)

13. class TreeSet

![alt text](image-18.png)

14. class PriorityQueue

![alt text](image-19.png)

15. class ArrayDeque

![alt text](image-20.png)


16. interface Map

![alt text](image-13.png)

17. abstract class AbstractMap

![alt text](image-14.png)

18. class HashMap

![alt text](image-24.png)

19. class EnumMap

![alt text](image-16.png)

20. interface SortedMap

![alt text](image-21.png)

21. interface NavigableMap

![alt text](image-22.png)

22. class TreeMap

![alt text](image-23.png)










todo 1: Look into (CLoneable interface, java.io.serializable interface, RandomAccess)

## Methods of the Collection Interface
- add(Object) : This method is used to add an object to the collection.
- addAll(Collection c) :  This method adds all the elements in the given collection to this collection.
- clear() : This method removes all of the elements from this collection.
- contains(Object o) : This method returns true if the collection contains the specified element.
- containsAll(Collection c) : This method returns true if the collection contains all of the elements in the given collection.
- equals(Object o) : equals(Object o)
- hashCode() : This method is used to return the hash code value for this collection.
- isEmpty() : This method returns true if this collection contains no elements.
- iterator() : This method returns an iterator over the elements in this collection.
- max() : This method is used to return the maximum value present in the collection.
- parallelStream() : This method returns a parallel Stream with this collection as its source.
- remove(Object o) : This method is used to remove the given object from the collection. If there are duplicate values, then this method removes the first occurrence of the object.
- removeIf(Predicate filter) : This method is used to remove all the elements of this collection that satisfy the given predicate.
- retainAll(Collection c) :T his method is used to retain only the elements in this collection that are contained in the specified collection.
- size() : This method is used to return the number of elements in the collection.
- spliterator() : This method is used to create a Spliterator over the elements in this collection.
- stream() : This method is used to return a sequential Stream with this collection as its source.
- toArray() : This method is used to return an array containing all of the elements in this collection.

## Methods expicit to the Set Interface


