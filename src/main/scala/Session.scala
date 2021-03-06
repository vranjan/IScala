package org.refptr.iscala

class Session {
    lazy val id: Int = DB.newSession()

    def endSession(num_cmds: Int) {
        DB.endSession(id)(num_cmds)
    }

    def addHistory(line: Int, source: String) {
        DB.addHistory(id)(line, source)
    }

    def addOutputHistory(line: Int, output: String) {
        DB.addOutputHistory(id)(line, output)
    }
}
