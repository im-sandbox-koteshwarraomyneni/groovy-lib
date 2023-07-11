@Library('my-custom-library') _

pipeline {
    agent any

    stages {
        stage('Example') {
            steps {
                script {
                    // Call functions from the custom library
                    MyCustomLibrary.greet('John')
                    def result = MyCustomLibrary.calculateSum(2, 3)
                    println "The sum is: $result"
                }
            }
        }
    }
}
