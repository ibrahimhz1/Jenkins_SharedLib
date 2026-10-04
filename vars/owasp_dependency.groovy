def call() {
    dependencyCheck(
        additionalArguments: '''
            --scan ./
            --nvdDatafeed https://dependency-check.github.io/DependencyCheck_Builder/nvd_cache/nvdcve-{0}.json.gz
        ''',
        odcInstallation: 'OWASP'
    )

    dependencyCheckPublisher(
        pattern: '**/dependency-check-report.xml'
    )
}
