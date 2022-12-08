pipeline {
    agent any
    options {
        skipStagesAfterUnstable()
    }
    stages ('Build') {
        steps {
            sh 'mvn clean install -DskipTests'
        }
    }
    stages ('Deploy') {
        steps {
            sh 'mvn spring-boot:run'
        }
    }
}