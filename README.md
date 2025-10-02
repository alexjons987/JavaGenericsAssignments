### 1. Product Filter (Predicate + T)
- [x] Create a generic method `filterList(List<T> list, Predicate<T> condition)` that returns a new list with only the elements that match the condition.
- Test the method on a list of `Product` (as before) to filter:
  1. [x] i. Products under 100 kr.
  2. [x] ii. Products that are in stock.
  3. [x] iii. Combination with `.and()`.

---

### 2. Employee Management (Consumer + T)
- [x] Create a generic method `forEachApply(List<T> list, Consumer<T> action)` that runs `action.accept()` on each element in the list.
- Test with `Employee` objects where you:
  1. [x] i. Increase salaries by 10%.
  2. [x] ii. Print information about all employees.

---

### 3. Library (Comparator + T)
- [ ] Create a generic method `sortList(List<T> list, Comparator<T> comparator)` that sorts a list.
- Test with `Book` objects:
  1. [ ] i. Sort by year.
  2. [ ] ii. Sort by author.
  3. [ ] iii. Sort by year and then title. 
- [ ] Extra: Create a method `maxBy(List<T>, Comparator<T>)` that returns the largest book according to a certain comparator.

---

### 4. Student Filter and Sort (Predicate + Comparator + T, R)
- [ ] Create a generic method `mapList(List<T> list, Function<T, R> mapper)` that converts a list of type T to a list of type R.
- [ ] Make a list of `Student`.
- [ ] Filter (with Predicate) all those with grades > 70.
- [ ] Sort with Comparator by grade (highest first).
- [ ] Use `mapList` to convert the list of `Student` to a list of `String` where each element is `"Name: [name], Grade: [grade]"`.

---

### 5. Order Management (Predicate + Comparator + Consumer + T)
- [ ] Create a generic method:
```java
public static <T> void processItems(
        List<T> list,
        Predicate<T> filter,
        Comparator<T> sorter,
        Consumer<T> action
);
```
- The method should:
  1. [ ] i. Filter the list with `Predicate`.
  2. [ ] ii. Sort with `Comparator`.
  3. [ ] iii. Run `Consumer` on each element.
- [ ] Test with a list `Order` (`id`, `customerName`, `amount`, `completed`).
- [ ] Filter out only the incomplete orders.
- [ ] Sort them by amount (largest first).
- [ ] Print all with `Consumer`.

---
