**Exceptions**  

Αναπτύξτε μία μέθοδο που εμφανίζει ένα μενού με επιλογές από 1 έως 4 (και 5 για Exit) καθώς και μία μέθοδο int getChoice() για να διαβάσετε το choice του χρήστη με Scanner
Ο Scanner να δηλωθεί σε επίπεδο κλάσης.

Στη μέθοδο int getChoice() αν ο χρήστης δώσει μη-ακέραιο ελέγξτε κατάλληλα με state-testing (hasNextInt())
Επίσης, Αν η επιλογή δεν είναι μεταξύ 1-5 τότε δημιουργεί (throws) ένα IllegalArgumentException, το οποίο παρότι είναι RunTimeException, θα μπορούσαμε στη συγκεκριμένη περίπτωση να κάνουμε recover και να κάναμε try/catch στη main.

Αναπτύξτε επίσης μία μέθοδο void printChoice(int choice) που εκτυπώνει την επιλογή. 

Διαμορφώστε τη main ώστε να κάνει catch το exception και να επικοινωνεί με τον χρήστη με κατάλληλο μήνυμα.

Στο πλαίσιο της ενδεικτικής λύσης έχει υλοποιηθεί περαιτέρω και μία μέθοδος log(Exception e) που γράφει σε ένα αρχείο
(log file) ένα timestamp με LocalDateTime.now() καθώς και το message του Exception.

Επίσης, έχει υλοποιηθεί η βοηθητική μέθοδος isValidChoice(int choice)

**Simple Bank**

Γράψτε μία μέθοδο void withdraw(double amount) η οποία κάνει ανάληψη ενός ποσό amount, μειώνοντας το balance
αντίστοιχα. 

Η withdraw(double amount) ελέγχει αν το amount είναι μικρότερο από το 0 ή μεγαλύτερο από το balance, οπότε
τότε δημιουργεί ένα exception IllegalArgumentException. Το Exception αυτό η withdraw() το κάνει try / catch, στο
catch κάνει System.err.println("Error: " + e.getMessage()); και μετά rethrow

Αλλάξτε επίσης τη main() ώστε να κάνει και αυτή με τη σειρά της try / catch το αντίστοιχο IllegalArgumentException
και να ενημερώνει κατάλληλα τον χρήστη.


