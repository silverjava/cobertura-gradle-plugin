package com.thoughtworks.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project
import com.thoughtworks.plugin.tasks.InstrumentTask
import com.thoughtworks.plugin.tasks.ReportTask
import com.thoughtworks.plugin.tasks.CheckTask

/**
 * Created with IntelliJ IDEA.
 * User: tw
 * Date: 2/23/13
 * Time: 2:56 PM
 * To change this template use File | Settings | File Templates.
 */
class CoberturaPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.task('coberturaInstrument', type: InstrumentTask)
        project.task('coberturaReport', type: ReportTask)
        project.task('coberturaCheck', type: CheckTask)
    }
}
