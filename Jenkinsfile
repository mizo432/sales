node {
   stage ('git clone'){
      git 'https://github.com/mizo432/sales.git'
   }

   stage ('clean'){
      sh './gradlew --daemon clean'
   }

   stage ('build'){
      sh './gradlew --daemon :sales-utils:build'
      sh './gradlew --daemon :sales-core:build'
      sh './gradlew --daemon :sales-core-mocks:build'
      sh './gradlew --daemon :sales-datasources:build'
      sh './gradlew --daemon :sales-reports:build'
      sh './gradlew --daemon :sales-usecases:build'
      sh './gradlew --daemon :sales-presentations:build'
      sh './gradlew --daemon :sales-web:build'
   }

   stage ('create reports'){
      sh './gradlew --daemon jacocoTestReport'

      sh './gradlew --daemon jdepend'

      sh './gradlew --daemon findbugsMain'

   }

// JUnitテストレポートを保存
//   stage ('copy test report'){
//      step([$class: 'JUnitResultArchiver', testResults: '**/build/test-results/*.xml'])
//   }

   stage('assembles reports'){
        jacoco exclusionPattern: '**/*Test*.class'
        openTasks canComputeNew: false, defaultEncoding: '', excludePattern: '', healthy: '', high: 'FIXME', low: 'XXX', normal: 'TODO', pattern: '**/*.java', unHealthy: ''
        findbugs canComputeNew: false, defaultEncoding: '', excludePattern: '', healthy: '', includePattern: '', pattern: '**/build/reports/findbugs/*.xml', unHealthy: ''
        warnings canComputeNew: false, canResolveRelativePaths: false, consoleParsers: [[parserName: 'Java Compiler (javac)'], [parserName: 'JavaDoc Tool']], defaultEncoding: '', excludePattern: '', healthy: '', includePattern: '', messagesPattern: '', unHealthy: ''
   }
}