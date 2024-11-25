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


**ChatGPT Prompt**  
Mark the answer using the Marking Rubric above. Provide feedback for each section on what was awarded marks, where to improve and how. Provide a feedback table.