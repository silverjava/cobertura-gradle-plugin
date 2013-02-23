package com.thoughtworks.plugin.tasks

import org.gradle.api.tasks.TaskAction
import org.gradle.api.DefaultTask

/**
 * Created with IntelliJ IDEA.
 * User: tw
 * Date: 2/23/13
 * Time: 2:59 PM
 * To change this template use File | Settings | File Templates.
 */
class InstrumentTask extends DefaultTask {

    @TaskAction
    void instrument() {
        println 'instrument target class'
    }
}
