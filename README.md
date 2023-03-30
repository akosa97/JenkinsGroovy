In this pipeline code, we define a series of stages that correspond to the different steps in a basic CI/CD workflow:

    Build: This stage installs the necessary dependencies and builds the web application using 'npm'.
    Test: This stage runs automated tests to ensure the application functions correctly.
    Deploy to Staging: This stage deploys the application to a staging environment for further testing and validation.
    Smoke Test: This stage runs a subset of tests to verify the key functionality of the deployed application.
    Deploy to Production: This stage deploys the application to production, making it available to end-users.
