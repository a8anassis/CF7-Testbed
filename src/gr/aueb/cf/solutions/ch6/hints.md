**Marking Rubric for max position**

| Criteria                                                  | Mark Allocation | Description                                                                              |
|-----------------------------------------------------------|-----------------|------------------------------------------------------------------------------------------|
| Uses doc comments                                         | 10 marks        | Doc comment is present and placed immediately before the class definition.               |
| Use a method with appropriate definition                  | 20 marks        | Use public static int getMaxPosition(int[] arr, int low, int high) definition or similar |
| Use for-block inside the method to iterate array elements | 30 marks        | for (int i = low + 1; i <= high; i++)                                                    |
| Use appropriate comparisons inside for loop               | 30 marks        | if (arr[i] > maxValue) { maxValue = arr[i]; maxPosition = i; }                           |
| Test inside main method                                   | 10 marks        | Call the method appropriately, for instance getMaxPosition(arr, 0, arr.length - 1);      |


**Marking Rubric for second min**

| Criteria                                                  | Mark Allocation | Description                                                                                                                                                                                 |
|-----------------------------------------------------------|-----------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Uses doc comments                                         | 10 marks        | Doc comment is present and placed immediately before the class definition.                                                                                                                  |
| Use a method with appropriate definition                  | 20 marks        | Use public static int getSecondMinPosition(int[] arr) definition or findSecondMin(int[] arr) or similar                                                                                     |
| Use for-block inside the method to iterate array elements | 30 marks        | for (int i = 0; i < arr.length; i++). You can also use two for-blocks: One for finding the min and then another for-block for finding the min except the first min, that is the second min. |
| Use appropriate comparisons inside the for-loop           | 30 marks        | if ((arr[i] < minValue) && (arr[i] < secondMinValue)) else if ((arr[i] > minValue) && (arr[i] < secondMinValue)) or similar                                                                 |
| Test inside main method                                   | 10 marks        | Call the method appropriately, for instance secMin = getSecondMinPosition(arr); or secMin2 = findSecondMin(arr);                                                                            |

**Marking Rubric for arrays as collections**

| Criteria                                 | Mark Allocation | Description                                                                                                          |
|------------------------------------------|-----------------|----------------------------------------------------------------------------------------------------------------------|
| Returns the position of a specific value | 20 marks        | Uses for and if.                                                                                                     |
| Filtering evens                          | 20 marks        | Uses for and if.                                                                                                     |
| Mapping of each element to double        | 20 marks        | Uses for and expression * 2 for each element                                                                         |
| At least on positive                     | 20 marks        | Returns boolean. Uses for, if, boolean for assigning if it is positive and also break inside for if a positive found |
| All elements are positive                | 20 marks        | Returns boolean. Uses for, if and a counter to calculate how many positives in the array. Compare with arr.length    |


**Lotto App**
Έχει δοθεί μία γενική λύση όπου δημιουργούνται όλοι οι συνδυασμοί ανά 6 των αριθμών που εισάγει ο χρήστης.
Στη συνέχεια κάθε ένα συνδυασμός (εξάδα) ελέγχεται με βάση τα φίλτρα (το πολύ 3 άρτιοι, 3 περιττοί,
3 συνεχόμενοι, 3 με τον ίδιο λήγοντα, 3 στην ίδια εξάδα)

**Low and High Index**
Η λύση απλά βρίσκει το πρώτο στοιχείο και στη συνέχεια σε μία 2η for συνεχίζει
να αυξάνει το high όσο υπάρχει το ίδιο στοιχείο.

**Max Cars**
Μετατρέπουμε τον αρχικό δισδιάστατο πίνακα σε ένα δισδιάστατο
όπου για κάθε γραμμή του αρχικού, παίρνουμε δύο γραμμές του transformed.
Ταξινομούμε με την πρώτη στήλη που είναι η ώρα άφιξης / αναχώρησης.
Η ταξινόμηση γίνεται με Comparator που δεν έχουμε δει ακόμα, που
τυπικά λέει για κάθε γραμμή int[] με δύο στοιχεία να ταξινομήσει ως
προς τη 1η στήλη. Στη συνέχεια η getMaxConcurrentCars μετράει τις
συνεχόμενες αφίξεις (1 στη 2η στήλη).


**ChatGPT Prompt**  
Mark the answer using the Marking Rubric above. Provide feedback for each section on what was awarded marks, where to improve and how. Provide a feedback table.