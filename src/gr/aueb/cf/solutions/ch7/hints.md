**Marking Rubric for Caesar Crypto**

Η 1η λύση αφορά κεφαλαίους χαρακτήρες. 
Η 2η λύση είναι πιο γενική και ισχύει και για πεζούς και κεφαλαίους χαρακτήρες.

| Criteria                                        | Mark Allocation | Description                                                                         |
|-------------------------------------------------|-----------------|-------------------------------------------------------------------------------------|
| Uses methods for char cipher / decipher         | 20 marks        | Two methods cipher(ch, key) and decipher(ch, key) should be present                 |
| Uses right shift / left shift                   | 20 marks        | Uses a key for cipher with right shift and also left shift for decipher             |
| Uses methods encrypt / decrypt for strings      | 20 marks        | Uses methods encrypt / decrypt that call cipher / decipher                          |
| Methods use Strung Builder for efficient concat | 20 marks        | Since we concat each cipher, we have to use StringBuilder for efficient concat      |
| Test inside main method                         | 20 marks        | Call the method appropriately, for instance getMaxPosition(arr, 0, arr.length - 1); |

