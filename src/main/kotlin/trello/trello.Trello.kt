@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package trello

import kotlin.js.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import tsstdlib.PromiseLike
import Trello.Callback.Cache

@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
external interface PowerUp {
    var version: String
    var Promise: PromiseLike<Any>
    var CallbackCache: Cache
    var PostMessageIO: Any
    fun iframe(options: IFrameOptions = definedExternally): IFrame
    fun initialize(handlers: CapabilityHandlers, options: PluginOptions = definedExternally): dynamic /* PowerUp.Plugin | PowerUp.IFrame */
    fun restApiError(): Any
    var util: Util
    interface ResourceDictionary {
        @nativeGetter
        operator fun get(key: String): String?
        @nativeSetter
        operator fun set(key: String, value: String)
    }
    interface `T$0` {
        var entries: Array<Attachment>
    }
    interface CapabilityHandlers {
        @nativeGetter
        operator fun get(key: String): Any?
        @nativeSetter
        operator fun set(key: String, value: ((t: IFrame, options: `T$0`) -> dynamic)?)
        @nativeSetter
        operator fun set(key: String, value: ((t: IFrame, options: AttachmentThumbnailOptions) -> dynamic)?)
        @nativeSetter
        operator fun set(key: String, value: ((t: IFrame) -> dynamic)?)
        @nativeSetter
        operator fun set(key: String, value: ((t: IFrame) -> dynamic)?)
        @nativeSetter
        operator fun set(key: String, value: ((t: IFrame) -> dynamic)?)
        @nativeSetter
        operator fun set(key: String, value: ((t: IFrame) -> dynamic)?)
        @nativeSetter
        operator fun set(key: String, value: ((t: IFrame) -> dynamic)?)
        @nativeSetter
        operator fun set(key: String, value: ((t: IFrame, options: CardFromUrlOptions) -> dynamic)?)
        @nativeSetter
        operator fun set(key: String, value: ((t: IFrame, options: FormatUrlOptions) -> Unit)?)
        @nativeSetter
        operator fun set(key: String, value: ((t: IFrame) -> dynamic)?)
        @nativeSetter
        operator fun set(key: String, value: ((t: IFrame) -> dynamic)?)
        @nativeSetter
        operator fun set(key: String, value: ((t: IFrame) -> PromiseLike<Unit>)?)
        @nativeSetter
        operator fun set(key: String, value: ((t: IFrame) -> Unit)?)
        @nativeSetter
        operator fun set(key: String, value: ((t: IFrame, options: Any) -> Unit)?)
        @nativeSetter
        operator fun set(key: String, value: ((t: IFrame, options: Any) -> PromiseLike<AuthorizationStatusResponse>)?)
    }
    interface CardFromUrlOptions {
        var url: String
    }
    interface FormatUrlOptions {
        var url: String
    }
    interface `T$1` {
        var url: String
        var size: String /* "contain" | "original" | "cover" */
    }
    interface FormatUrlResponse {
        var icon: String
        var text: String
        var subtext: String
        var image: `T$1`
        var actions: Array<FormatUrlActions>
        var thumbnail: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FormatUrlActions {
        var text: String
        var callback: (t: IFrame) -> Unit
    }
    interface CardFromUrlResponse {
        var name: String
        var desc: String
    }
    interface PopupOptionsItem {
        var text: String
        val callback: ((t: Any, options: Any) -> PromiseLike<Unit>)?
    }
    interface AuthorizationStatusResponse {
        var authorized: Boolean
    }
    interface `T$2` {
        var url: String
        var logo: Boolean
    }
    interface AttachmentThumbnail {
        var title: String
        var image: `T$2`
    }
    interface AttachmentThumbnailOptions {
        var url: String
    }
    interface PopupOptions {
        var title: String
        var items: Array<PopupOptionsItem>
        var mouseEvent: MouseEvent?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface `T$3` {
        var count: Number?
            get() = definedExternally
            set(value) = definedExternally
        var placeholder: String?
            get() = definedExternally
            set(value) = definedExternally
        var empty: String?
            get() = definedExternally
            set(value) = definedExternally
        var searching: String?
            get() = definedExternally
            set(value) = definedExternally
        var debounce: Number?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PopupSearchOptions : PopupOptions {
        var search: `T$3`
    }
    interface `T$4` {
        var locale: String
    }
    interface PopupIframeOptions {
        val callback: ((t: IFrame, options: `T$4`) -> Unit)?
        var title: String
        var url: String
        var args: Json?
            get() = definedExternally
            set(value) = definedExternally
        var height: Number?
            get() = definedExternally
            set(value) = definedExternally
        var mouseEvent: MouseEvent?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface `T$5` {
        var date: String
    }
    interface PopupDateOptions {
        var type: String /* "date" | "datetime" */
        var title: String
        fun callback(t: IFrame, options: `T$5`): PromiseLike<Unit>
        var date: Date?
            get() = definedExternally
            set(value) = definedExternally
        var minDate: Date?
            get() = definedExternally
            set(value) = definedExternally
        var maxDate: Date?
            get() = definedExternally
            set(value) = definedExternally
        var mouseEvent: MouseEvent
    }
    interface PopupConfirmOptions {
        var type: String /* "confirm" */
        var title: String
        var message: String
        var confirmText: String
        fun onConfirm(t: IFrame, opts: Any): PromiseLike<Unit>
        var confirmStyle: String? /* "primary" | "danger" */
            get() = definedExternally
            set(value) = definedExternally
        var mouseEvent: MouseEvent
    }
    interface PopupConfirmWithCancelOptions : PopupConfirmOptions {
        var cancelText: String
        fun onCancel(t: IFrame, opts: Any): PromiseLike<Unit>
    }
    interface HeaderAction {
        var icon: String
        var alt: String
        fun callback()
        var position: String /* "left" | "right" */
        var url: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Localizer {
        var resourceDictionary: ResourceDictionary
        fun localize(key: String, args: Array<String>): String
    }
    interface Localization {
        var defaultLocale: String
        var supportedLocales: Array<String>
        var resourceUrl: String
    }
    interface LocalizerOptions {
        var localizer: Localizer?
            get() = definedExternally
            set(value) = definedExternally
        val loadLocalizer: (() -> PromiseLike<Localizer>)?
        var localization: Localization?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface `T$6` {
        fun getHexString(): String
        fun namedColorStringToHex(): String
    }
    interface `T$7` {
        fun bytesToHexString(): String
        fun hexStringToUint8Array(): Any
    }
    interface `T$8` {
        fun decryptSecret(): Any
        fun encryptSecret(): Any
        fun exportAESCBCKeyToRaw(): Any
        fun generateAESCBCKey(): Any
        fun generateInitVector(): Any
        fun importAESCBCKeyFromRaw(): Any
        fun sha256Digest(): Any
    }
    interface Util {
        var color: `T$6`
        var convert: `T$7`
        var crypto: `T$8`
        fun initLocalizer(locale: String, options: LocalizerOptions): PromiseLike<Unit>
        fun makeErrorEnum(): Error
        fun relativeUrl(url: String): String
    }
    interface `T$9` {
        @nativeGetter
        operator fun get(key: String): String?
        @nativeSetter
        operator fun set(key: String, value: String)
    }
    interface AnonymousHostHandlers {
        fun requestWithContext(command: String, options: Any): PromiseLike<Any>
        fun getAll(): PromiseLike<Any>
        fun get(scope: String /* "board" | "card" | "organization" | "member" | String */, visibility: String /* "shared" | "private" */, key: String = definedExternally, defaultValue: Any = definedExternally): PromiseLike<Any>
        fun set(scope: String /* "board" | "card" | "organization" | "member" | String */, visibility: String /* "shared" | "private" */, key: String, defaultValue: Any = definedExternally): PromiseLike<Unit>
        fun set(scope: String /* "board" | "card" | "organization" | "member" | String */, visibility: String /* "shared" | "private" */, key: String): PromiseLike<Unit>
        fun set(scope: String /* "board" | "card" | "organization" | "member" | String */, visibility: String /* "shared" | "private" */, entries: Json): PromiseLike<Unit>
        fun remove(scope: String /* "board" | "card" | "organization" | "member" | String */, visibility: String /* "shared" | "private" */, key: String): PromiseLike<Unit>
        fun remove(scope: String /* "board" | "card" | "organization" | "member" | String */, visibility: String /* "shared" | "private" */, entries: Array<String>): PromiseLike<Unit>
        fun safe(html: String): String
        fun localizeKey(key: String, data: `T$9` = definedExternally): String
        fun localizeKeys(keys: Any /* JsTuple<Any> */): Array<String>
        fun localizeNode(node: Element)
        fun board(vararg fields: Any /* JsTuple<String> */): PromiseLike<Board>
        fun board(vararg fields: String /* "id" | "name" | "url" | "shortLink" | "members" | "dateLastActivity" | "idOrganization" | "customFields" | "labels" | "memberships" */): PromiseLike<Board>
        fun cards(vararg fields: Any /* JsTuple<String> */): PromiseLike<Array<Card>>
        fun cards(vararg fields: String /* "address" | "attachments" | "badges" | "closed" | "coordinates" | "cover" | "customFieldItems" | "dateLastActivity" | "desc" | "due" | "dueComplete" | "id" | "idList" | "idShort" | "labels" | "locationName" | "members" | "name" | "pos" | "shortLink" | "url" */): PromiseLike<Array<Card>>
        fun lists(vararg fields: Any /* JsTuple<String> */): PromiseLike<Array<List>>
        fun lists(vararg fields: String /* "id" | "name" | "cards" */): PromiseLike<Array<List>>
        fun member(vararg fields: Any /* JsTuple<String> */): PromiseLike<Member>
        fun member(vararg fields: String /* "id" | "fullName" | "username" | "initials" | "avatar" */): PromiseLike<Member>
        fun organization(vararg fields: Any /* JsTuple<String> */): PromiseLike<Organization>
        fun organization(vararg fields: String /* "id" | "name" */): PromiseLike<Organization>
    }
    interface `T$10` {
        var url: String
    }
    interface `T$11` {
        var message: String
        var duration: Number?
            get() = definedExternally
            set(value) = definedExternally
        var display: String? /* "info" | "warning" | "error" | "success" */
            get() = definedExternally
            set(value) = definedExternally
    }
    interface `T$12` {
        var url: String
        var args: Json
        var inset: Any
    }
    interface `T$13` {
        var url: String
        var args: Json?
            get() = definedExternally
            set(value) = definedExternally
        var height: Number?
            get() = definedExternally
            set(value) = definedExternally
        var accentColor: String? /* String? | "blue" | "green" | "orange" | "red" | "yellow" | "purple" | "pink" | "sky" | "lime" | "light-gray" | "business-blue" */
            get() = definedExternally
            set(value) = definedExternally
        val callback: ((t: IFrame) -> Unit)?
        var title: String?
            get() = definedExternally
            set(value) = definedExternally
        var actions: Array<HeaderAction>?
            get() = definedExternally
            set(value) = definedExternally
        var resizable: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface `T$14` {
        var url: String
        var accentColor: String? /* String? | "blue" | "green" | "orange" | "red" | "yellow" | "purple" | "pink" | "sky" | "lime" | "light-gray" | "business-blue" */
            get() = definedExternally
            set(value) = definedExternally
        var height: Number?
            get() = definedExternally
            set(value) = definedExternally
        var fullscreen: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        val callback: (() -> Unit)?
        var title: String?
            get() = definedExternally
            set(value) = definedExternally
        var actions: Array<HeaderAction>?
            get() = definedExternally
            set(value) = definedExternally
        var args: Json?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface `T$15` {
        var accentColor: String? /* String? | "blue" | "green" | "orange" | "red" | "yellow" | "purple" | "pink" | "sky" | "lime" | "light-gray" | "business-blue" */
            get() = definedExternally
            set(value) = definedExternally
        var actions: Array<HeaderAction>?
            get() = definedExternally
            set(value) = definedExternally
        var fullscreen: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var title: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface `T$16` {
        var inset: Any?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface `T$17` {
        var name: String
        var url: String
    }
    interface `T$18` {
        var height: Number?
            get() = definedExternally
            set(value) = definedExternally
        var width: Number?
            get() = definedExternally
            set(value) = definedExternally
        val validToken: ((value: String) -> Boolean)?
    }
    interface `T$19` {
        var targetOrigin: String
    }
    interface HostHandlers : AnonymousHostHandlers {
        fun getContext(): Context
        fun isMemberSignedIn(): Boolean
        fun memberCanWriteToModel(modelType: String /* "board" | "card" | "organization" */): Boolean
        fun arg(name: String, defaultValue: Any = definedExternally): Any
        fun signUrl(url: String, args: Json = definedExternally): String
        fun navigate(options: `T$10`): Any
        fun showCard(idCard: String): PromiseLike<Unit>
        fun hideCard(): PromiseLike<Unit>
        fun alert(options: `T$11`): PromiseLike<Unit>
        fun hideAlert(): PromiseLike<Unit>
        fun popup(options: PopupOptions): PromiseLike<Unit>
        fun popup(options: PopupSearchOptions): PromiseLike<Unit>
        fun popup(options: PopupIframeOptions): PromiseLike<Unit>
        fun popup(options: PopupDateOptions): PromiseLike<Unit>
        fun popup(options: PopupConfirmOptions): PromiseLike<Unit>
        fun popup(options: PopupConfirmWithCancelOptions): PromiseLike<Unit>
        fun overlay(options: `T$12`): PromiseLike<Unit>
        fun boardBar(options: `T$13`): PromiseLike<Unit>
        fun modal(options: `T$14`): PromiseLike<Unit>
        fun updateModal(options: `T$15`): PromiseLike<Unit>
        fun closePopup(): PromiseLike<Unit>
        fun back(): PromiseLike<Unit>
        fun hideOverlay(): PromiseLike<Unit>
        fun closeOverlay(options: `T$16` = definedExternally): PromiseLike<Unit>
        fun hideBoardBar(): PromiseLike<Unit>
        fun closeBoardBar(): PromiseLike<Unit>
        fun closeModal(): PromiseLike<Unit>
        fun sizeTo(arg: String): PromiseLike<Unit>
        fun sizeTo(arg: Number): PromiseLike<Unit>
        fun sizeTo(arg: Element): PromiseLike<Unit>
        fun card(vararg fields: Any /* JsTuple<String> */): PromiseLike<Card>
        fun card(vararg fields: String /* "address" | "attachments" | "badges" | "closed" | "coordinates" | "cover" | "customFieldItems" | "dateLastActivity" | "desc" | "due" | "dueComplete" | "id" | "idList" | "idShort" | "labels" | "locationName" | "members" | "name" | "pos" | "shortLink" | "url" */): PromiseLike<Card>
        fun list(vararg fields: Any /* JsTuple<String> */): PromiseLike<List>
        fun list(vararg fields: String /* "id" | "name" | "cards" */): PromiseLike<List>
        fun attach(data: `T$17`): PromiseLike<Unit>
        fun requestToken(options: Any): PromiseLike<String>
        fun authorize(authUrl: String, options: `T$18` = definedExternally): PromiseLike<String>
        fun storeSecret(secretKey: String, secretData: String): PromiseLike<Unit>
        fun loadSecret(secretKey: String): PromiseLike<String>
        fun clearSecret(secretKey: String): PromiseLike<Unit>
        fun notifyParent(message: String /* "done" */, options: `T$19` = definedExternally): PromiseLike<Unit>
    }
    interface IFrameOptions : LocalizerOptions {
        var context: String?
            get() = definedExternally
            set(value) = definedExternally
        var secret: String?
            get() = definedExternally
            set(value) = definedExternally
        var helpfulStacks: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface IFrame : HostHandlers {
        var io: Any?
        var args: Array<Any>
        var secret: String?
            get() = definedExternally
            set(value) = definedExternally
        var options: IFrameOptions
        var i18nPromise: PromiseLike<Unit>
        fun init(): Any
        fun connect()
        fun request(command: String, options: Any): PromiseLike<Any>
        fun render(fxRender: () -> Unit): Any
        fun initApi()
        fun getRestApi(): Any
        fun initSentry()
        var NotHandled: Any
    }
    interface `T$20` {
        var id: String
    }
    interface `T$21` {
        fun setTags(name: String, value: String)
        fun setUser(value: `T$20`)
    }
    interface `T$22` {
        fun configureScope(callback: (scope: `T$21`) -> Unit)
    }
    interface PluginOptions : LocalizerOptions {
        var Sentry: `T$22`?
            get() = definedExternally
            set(value) = definedExternally
        var appKey: String?
            get() = definedExternally
            set(value) = definedExternally
        var appName: String?
            get() = definedExternally
            set(value) = definedExternally
        var apiOrigin: String?
            get() = definedExternally
            set(value) = definedExternally
        var authOrigin: String?
            get() = definedExternally
            set(value) = definedExternally
        var localStorage: Storage?
            get() = definedExternally
            set(value) = definedExternally
        var tokenStorageKey: String?
            get() = definedExternally
            set(value) = definedExternally
        var helpfulStacks: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Plugin : AnonymousHostHandlers {
        var options: PluginOptions
        fun connect(): Any
        fun request(command: String, options: Any): PromiseLike<Any>
        fun init(): Any
        fun NotHandled(): Any
    }
    interface `T$23` {
        var dark: String
        var light: String
    }
    interface BoardButtonBase {
        var icon: `T$23`
        var text: String
        var condition: String? /* "admin" | "always" | "edit" | "readonly" | "signedIn" | "signedOut" */
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BoardButtonCallback : BoardButtonBase {
        var callback: (t: IFrame) -> PromiseLike<Unit>
    }
    interface BoardButtonUrl : BoardButtonBase {
        var url: String
        var target: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface `T$24` {
        var type: String /* "iframe" */
        var url: String
        var height: Number?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CardBackSection {
        var title: String
        var icon: String
        var content: `T$24`
    }
    interface CardBadge {
        var text: String?
            get() = definedExternally
            set(value) = definedExternally
        var icon: String?
            get() = definedExternally
            set(value) = definedExternally
        var color: String? /* "blue" | "green" | "orange" | "red" | "yellow" | "purple" | "pink" | "sky" | "lime" | "light-gray" | "business-blue" */
            get() = definedExternally
            set(value) = definedExternally
        var refresh: Number?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CardBadgeDynamic {
        fun dynamic(): dynamic /* CardBadge | Promise<CardBadge> */
    }
    interface CardDetailBadge : CardBadge {
        val callback: ((t: IFrame) -> Unit)?
        var url: String?
            get() = definedExternally
            set(value) = definedExternally
        var target: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CardDetailBadgeDynamic {
        fun dynamic(): dynamic /* CardDetailBadge | Promise<CardDetailBadge> */
    }
    interface ListAction {
        var text: String
        fun callback(t: IFrame): PromiseLike<Unit>
    }
    interface `T$25` {
        var cards: Array<Card>
    }
    interface `T$26` {
        var sortedIds: Array<String>
    }
    interface ListSorter {
        var text: String
        fun callback(t: IFrame, options: `T$25`): PromiseLike<`T$26`>
    }
    interface CardButton {
        var icon: String
        var text: String
        var condition: String? /* "admin" | "always" | "edit" | "readonly" | "signedIn" | "signedOut" */
            get() = definedExternally
            set(value) = definedExternally
        fun callback(t: IFrame): PromiseLike<Unit>
        var url: String?
            get() = definedExternally
            set(value) = definedExternally
        var target: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface `T$27` {
        var board: Number
        var card: Number
    }
    interface AttachmentsByType {
        @nativeGetter
        operator fun get(key: String): `T$27`?
        @nativeSetter
        operator fun set(key: String, value: `T$27`)
    }
    interface Preview {
        var bytes: Number
        var height: Number
        var scaled: Boolean
        var url: String
        var width: Number
    }
    interface `T$28` {
        var type: String
        var url: String
        var height: Number?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AttachmentSectionBase {
        var claimed: Array<Attachment>
        var icon: String
        var content: `T$28`
    }
    interface AttachmentSection : AttachmentSectionBase {
        var title: String
    }
    interface LazyAttachmentSection : AttachmentSectionBase {
        var id: String
        fun title(): String
    }
    interface Attachment {
        var date: String
        var edgeColor: String
        var id: String
        var idMember: String
        var name: String
        var previews: Array<Preview>
        var url: String
    }
    interface BadgesInfo {
        var attachments: Number
        var attachmentsByType: AttachmentsByType
        var checkItems: Number
        var checkItemsChecked: Number
        var comments: Number
        var description: Boolean
        var due: String
        var dueComplete: Boolean
        var fogbugz: String
        var location: Boolean
        var subscribed: Boolean
        var viewingMemberVoted: Boolean
        var votes: Number
    }
    interface Coordinates {
        var latitude: Number
        var longitude: Number
    }
    interface Label {
        var id: String
        var name: String
        var color: String /* "blue" | "green" | "orange" | "red" | "yellow" | "purple" | "pink" | "sky" | "lime" | "light-gray" | "business-blue" */
    }
    interface CustomField {
        var id: String
        var idCustomField: String
        var idValue: String?
            get() = definedExternally
            set(value) = definedExternally
        var value: CustomFieldValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CustomFieldValue {
        var checked: String?
            get() = definedExternally
            set(value) = definedExternally
        var date: String?
            get() = definedExternally
            set(value) = definedExternally
        var text: String?
            get() = definedExternally
            set(value) = definedExternally
        var number: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Membership {
        var deactivated: Boolean
        var id: String
        var idMember: String
        var memberType: String /* "admin" | "normal" | "observer" */
        var unconfirmed: Boolean
    }
    interface Organization {
        var id: String
        var name: String
    }
    interface Board {
        var id: String
        var name: String
        var url: String
        var shortLink: String
        var members: Array<Member>
        var dateLastActivity: String
        var idOrganization: String
        var customFields: Array<CustomField>
        var labels: Array<Label>
        var memberships: Array<Membership>
    }
    interface Card {
        var address: String?
        var attachments: Array<Attachment>
        var badges: BadgesInfo
        var closed: Boolean
        var coordinates: Coordinates?
        var cover: Attachment?
        var customFieldItems: Array<CustomField>
        var dateLastActivity: String
        var desc: String
        var due: String?
        var dueComplete: Boolean
        var id: String
        var idList: String
        var idShort: Number
        var labels: Array<Label>
        var locationName: String?
        var members: Array<Member>
        var name: String
        var pos: Number
        var shortLink: String
        var url: String
    }
    interface List {
        var id: String
        var name: String
        var cards: Array<Card>
    }
    interface Member {
        var id: String
        var fullName: String?
        var username: String?
        var initials: String?
        var avatar: String?
    }
    interface `T$29` {
        var board: String /* "read" | "write" */
        var card: String /* "read" | "write" */
        var organization: String /* "read" | "write" */
    }
    interface Context {
        var board: String
        var card: String?
            get() = definedExternally
            set(value) = definedExternally
        var command: String?
            get() = definedExternally
            set(value) = definedExternally
        var member: String
        var organization: String?
            get() = definedExternally
            set(value) = definedExternally
        var enterprise: String?
            get() = definedExternally
            set(value) = definedExternally
        var permissions: `T$29`?
            get() = definedExternally
            set(value) = definedExternally
        var version: String
    }
}