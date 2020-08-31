# spring5-applications

- In Spring 5.1, the Spring Development team changed the logging levels internally. As a result, 
by default you will no longer see the red logging messages at the INFO level.

## Solution

Overview of the steps

1. Create a bean to configure the parent logger and console handler

2. Configure the bean in the Spring XML config file
