@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package Trello.Callback

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*
import Trello.PowerUp.IFrame
import tsstdlib.PromiseLike

typealias SerializeResult = (value: Any, key: String) -> Any

external interface SerializeOutput {
    var _callback: String
}

external interface CacheOptions {
    var action: String /* "run" | "retain" | "release" */
    var options: Any
    var callback: String
}

external interface Cache {
    fun callback(t: IFrame, options: CacheOptions, serializeResult: SerializeResult): PromiseLike<Any>
    fun serialize(fx: (t: IFrame, args: Any) -> Any): SerializeOutput
    fun reset()
}