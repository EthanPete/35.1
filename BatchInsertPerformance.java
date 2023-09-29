import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BatchInsertPerformance {
    public static void main(String[] args) {
        // Simulate a database connection (in-memory list)
        List<Record> database = new ArrayList<>();

        // Simulate connecting to the database
        simulateConnectToDatabase();

        // Generate and insert a thousand records
        int numRecords = 1000;
        List<Record> records = generateRandomRecords(numRecords);

        // Measure the time taken for batch insert
        long startTime = System.currentTimeMillis();
        insertRecordsInBatch(database, records);
        long endTime = System.currentTimeMillis();

        // Calculate the time taken for batch insert
        long batchInsertTime = endTime - startTime;

        // Clear the database for the next test
        database.clear();

        // Measure the time taken for individual inserts
        startTime = System.currentTimeMillis();
        insertRecordsIndividually(database, records);
        endTime = System.currentTimeMillis();

        // Calculate the time taken for individual inserts
        long individualInsertTime = endTime - startTime;

        // Print the performance comparison
        System.out.println("Batch Insert Time: " + batchInsertTime + " ms");
        System.out.println("Individual Insert Time: " + individualInsertTime + " ms");
    }

    private static void simulateConnectToDatabase() {
        // Simulate a database connection dialog
        // You can add your own logic here to connect to a real database
        System.out.println("Simulating database connection...");
    }

    private static List<Record> generateRandomRecords(int numRecords) {
        List<Record> records = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < numRecords; i++) {
            double num1 = random.nextDouble();
            double num2 = random.nextDouble();
            double num3 = random.nextDouble();
            records.add(new Record(num1, num2, num3));
        }

        return records;
    }

    private static void insertRecordsInBatch(List<Record> database, List<Record> records) {
        // Simulate batch insert into the database (in-memory list)
        database.addAll(records);
    }

    private static void insertRecordsIndividually(List<Record> database, List<Record> records) {
        // Simulate individual inserts into the database (in-memory list)
        for (Record record : records) {
            database.add(record);
        }
    }
}

class Record {
    public Record(double num1, double num2, double num3) {
    }
}