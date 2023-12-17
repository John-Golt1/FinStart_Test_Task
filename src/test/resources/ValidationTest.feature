Feature: Validation of form fields with different inputs

  Scenario: Checking Invalid Middle Name Error
    Given User opens the application
    When User fills the form with "John", "1", "Test", "0932-124-1241"
    Then Check error for "Middle name" with message "Invalid Middle Name"

  Scenario: Checking Required First Name Error
    Given User opens the application
    When User fills the form with "", "Golt", "Test", "0932-124-1241"
    Then Check error for "First name" with message "This field is required."

  Scenario: Checking Incorrect Mobile Phone Error
    Given User opens the application
    When User fills the form with "John", "Golt", "Test", "0832-124-1241"
    Then Check error for "Mobile phone" with message "Should start with '09'"
