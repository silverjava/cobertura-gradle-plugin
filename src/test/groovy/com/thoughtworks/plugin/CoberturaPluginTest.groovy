package com.thoughtworks.plugin

import org.gradle.testfixtures.ProjectBuilder
import org.gradle.api.Project
import com.thoughtworks.plugin.tasks.InstrumentTask

import static org.junit.Assert.assertTrue
import org.junit.Test
import com.thoughtworks.plugin.tasks.ReportTask
import com.thoughtworks.plugin.tasks.CheckTask

class CoberturaPluginTest {

    @Test
    public void shouldAddCoberturaTasksToProject() {
        Project project = ProjectBuilder.builder().build()
        project.apply(plugin: 'cobertura')

        assertTrue(project.tasks.coberturaInstrument instanceof InstrumentTask)
        assertTrue(project.tasks.coberturaReport instanceof ReportTask)
        assertTrue(project.tasks.coberturaCheck instanceof CheckTask)
    }
}
