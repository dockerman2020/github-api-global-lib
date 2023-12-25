  def call(String mode, String environment, String database, String tableSchema) {
        // Your logic here
        println "Hello from Para shared"
        println "Mode: $mode"
        println "Environment: $environment"
        println "Database: $database"
        println "Table Schema: $tableSchema"
        // Add your business logic or call other methods as needed
    }
  sh "groovy --version"
