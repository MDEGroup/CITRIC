<?xml version = '1.0' encoding = 'ISO-8859-1' ?>
<asm version="1.0" name="0">
	<cp>
		<constant value="KM22SimpleExample"/>
		<constant value="links"/>
		<constant value="NTransientLinkSet;"/>
		<constant value="col"/>
		<constant value="J"/>
		<constant value="main"/>
		<constant value="A"/>
		<constant value="OclParametrizedType"/>
		<constant value="#native"/>
		<constant value="Collection"/>
		<constant value="J.setName(S):V"/>
		<constant value="OclSimpleType"/>
		<constant value="OclAny"/>
		<constant value="J.setElementType(J):V"/>
		<constant value="TransientLinkSet"/>
		<constant value="A.__matcher__():V"/>
		<constant value="A.__exec__():V"/>
		<constant value="self"/>
		<constant value="__resolve__"/>
		<constant value="1"/>
		<constant value="J.oclIsKindOf(J):B"/>
		<constant value="18"/>
		<constant value="NTransientLinkSet;.getLinkBySourceElement(S):QNTransientLink;"/>
		<constant value="J.oclIsUndefined():B"/>
		<constant value="15"/>
		<constant value="NTransientLink;.getTargetFromSource(J):J"/>
		<constant value="17"/>
		<constant value="30"/>
		<constant value="Sequence"/>
		<constant value="2"/>
		<constant value="A.__resolve__(J):J"/>
		<constant value="QJ.including(J):QJ"/>
		<constant value="QJ.flatten():QJ"/>
		<constant value="e"/>
		<constant value="value"/>
		<constant value="resolveTemp"/>
		<constant value="S"/>
		<constant value="NTransientLink;.getNamedTargetFromSource(JS):J"/>
		<constant value="name"/>
		<constant value="__matcher__"/>
		<constant value="A.__matchConceptA():V"/>
		<constant value="A.__matchBReferencesC():V"/>
		<constant value="A.__matchConceptC():V"/>
		<constant value="A.__matchConceptB():V"/>
		<constant value="__exec__"/>
		<constant value="ConceptA"/>
		<constant value="NTransientLinkSet;.getLinksByRule(S):QNTransientLink;"/>
		<constant value="A.__applyConceptA(NTransientLink;):V"/>
		<constant value="BReferencesC"/>
		<constant value="A.__applyBReferencesC(NTransientLink;):V"/>
		<constant value="ConceptC"/>
		<constant value="A.__applyConceptC(NTransientLink;):V"/>
		<constant value="ConceptB"/>
		<constant value="A.__applyConceptB(NTransientLink;):V"/>
		<constant value="__matchConceptA"/>
		<constant value="ModelElement"/>
		<constant value="KM2"/>
		<constant value="IN"/>
		<constant value="MMOF!Classifier;.allInstancesFrom(S):QJ"/>
		<constant value="J.=(J):J"/>
		<constant value="B.not():B"/>
		<constant value="33"/>
		<constant value="TransientLink"/>
		<constant value="NTransientLink;.setRule(MATL!Rule;):V"/>
		<constant value="me"/>
		<constant value="NTransientLink;.addSourceElement(SJ):V"/>
		<constant value="c"/>
		<constant value="SimpleExample"/>
		<constant value="NTransientLink;.addTargetElement(SJ):V"/>
		<constant value="NTransientLinkSet;.addLink2(NTransientLink;B):V"/>
		<constant value="10:7-10:9"/>
		<constant value="10:7-10:14"/>
		<constant value="10:17-10:27"/>
		<constant value="10:7-10:27"/>
		<constant value="13:5-16:6"/>
		<constant value="__applyConceptA"/>
		<constant value="NTransientLink;"/>
		<constant value="NTransientLink;.getSourceElement(S):J"/>
		<constant value="NTransientLink;.getTargetElement(S):J"/>
		<constant value="3"/>
		<constant value="Bs"/>
		<constant value="J.getSet(J):J"/>
		<constant value="Cs"/>
		<constant value="14:13-14:15"/>
		<constant value="14:23-14:27"/>
		<constant value="14:13-14:28"/>
		<constant value="14:7-14:28"/>
		<constant value="15:13-15:15"/>
		<constant value="15:23-15:27"/>
		<constant value="15:13-15:28"/>
		<constant value="15:7-15:28"/>
		<constant value="link"/>
		<constant value="__matchBReferencesC"/>
		<constant value="23:7-23:9"/>
		<constant value="23:7-23:14"/>
		<constant value="23:17-23:31"/>
		<constant value="23:7-23:31"/>
		<constant value="26:5-28:6"/>
		<constant value="__applyBReferencesC"/>
		<constant value="Property"/>
		<constant value="J.getStringProperty(J):J"/>
		<constant value="27:19-27:21"/>
		<constant value="27:40-27:50"/>
		<constant value="27:19-27:51"/>
		<constant value="27:7-27:51"/>
		<constant value="__matchConceptC"/>
		<constant value="35:7-35:9"/>
		<constant value="35:7-35:14"/>
		<constant value="35:17-35:27"/>
		<constant value="35:7-35:27"/>
		<constant value="38:5-40:6"/>
		<constant value="__applyConceptC"/>
		<constant value="ReferringBs"/>
		<constant value="J.getRefSet(J):J"/>
		<constant value="39:22-39:24"/>
		<constant value="39:35-39:48"/>
		<constant value="39:22-39:49"/>
		<constant value="39:7-39:49"/>
		<constant value="__matchConceptB"/>
		<constant value="47:7-47:9"/>
		<constant value="47:7-47:14"/>
		<constant value="47:17-47:27"/>
		<constant value="47:7-47:27"/>
		<constant value="50:5-50:31"/>
		<constant value="__applyConceptB"/>
	</cp>
	<field name="1" type="2"/>
	<field name="3" type="4"/>
	<operation name="5">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<push arg="7"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="9"/>
			<pcall arg="10"/>
			<dup/>
			<push arg="11"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="12"/>
			<pcall arg="10"/>
			<pcall arg="13"/>
			<set arg="3"/>
			<getasm/>
			<push arg="14"/>
			<push arg="8"/>
			<new/>
			<set arg="1"/>
			<getasm/>
			<pcall arg="15"/>
			<getasm/>
			<pcall arg="16"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="24"/>
		</localvariabletable>
	</operation>
	<operation name="18">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="4"/>
		</parameters>
		<code>
			<load arg="19"/>
			<getasm/>
			<get arg="3"/>
			<call arg="20"/>
			<if arg="21"/>
			<getasm/>
			<get arg="1"/>
			<load arg="19"/>
			<call arg="22"/>
			<dup/>
			<call arg="23"/>
			<if arg="24"/>
			<load arg="19"/>
			<call arg="25"/>
			<goto arg="26"/>
			<pop/>
			<load arg="19"/>
			<goto arg="27"/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<load arg="19"/>
			<iterate/>
			<store arg="29"/>
			<getasm/>
			<load arg="29"/>
			<call arg="30"/>
			<call arg="31"/>
			<enditerate/>
			<call arg="32"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="33" begin="23" end="27"/>
			<lve slot="0" name="17" begin="0" end="29"/>
			<lve slot="1" name="34" begin="0" end="29"/>
		</localvariabletable>
	</operation>
	<operation name="35">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="4"/>
			<parameter name="29" type="36"/>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<load arg="19"/>
			<call arg="22"/>
			<load arg="19"/>
			<load arg="29"/>
			<call arg="37"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="6"/>
			<lve slot="1" name="34" begin="0" end="6"/>
			<lve slot="2" name="38" begin="0" end="6"/>
		</localvariabletable>
	</operation>
	<operation name="39">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<pcall arg="40"/>
			<getasm/>
			<pcall arg="41"/>
			<getasm/>
			<pcall arg="42"/>
			<getasm/>
			<pcall arg="43"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="7"/>
		</localvariabletable>
	</operation>
	<operation name="44">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<push arg="45"/>
			<call arg="46"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="47"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="48"/>
			<call arg="46"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="49"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="50"/>
			<call arg="46"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="51"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="52"/>
			<call arg="46"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="53"/>
			<enditerate/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="33" begin="5" end="8"/>
			<lve slot="1" name="33" begin="15" end="18"/>
			<lve slot="1" name="33" begin="25" end="28"/>
			<lve slot="1" name="33" begin="35" end="38"/>
			<lve slot="0" name="17" begin="0" end="39"/>
		</localvariabletable>
	</operation>
	<operation name="54">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="55"/>
			<push arg="56"/>
			<findme/>
			<push arg="57"/>
			<call arg="58"/>
			<iterate/>
			<store arg="19"/>
			<load arg="19"/>
			<get arg="38"/>
			<push arg="45"/>
			<call arg="59"/>
			<call arg="60"/>
			<if arg="61"/>
			<getasm/>
			<get arg="1"/>
			<push arg="62"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="45"/>
			<pcall arg="63"/>
			<dup/>
			<push arg="64"/>
			<load arg="19"/>
			<pcall arg="65"/>
			<dup/>
			<push arg="66"/>
			<push arg="45"/>
			<push arg="67"/>
			<new/>
			<pcall arg="68"/>
			<pusht/>
			<pcall arg="69"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="70" begin="7" end="7"/>
			<lne id="71" begin="7" end="8"/>
			<lne id="72" begin="9" end="9"/>
			<lne id="73" begin="7" end="10"/>
			<lne id="74" begin="25" end="30"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="64" begin="6" end="32"/>
			<lve slot="0" name="17" begin="0" end="33"/>
		</localvariabletable>
	</operation>
	<operation name="75">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="76"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="64"/>
			<call arg="77"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="66"/>
			<call arg="78"/>
			<store arg="79"/>
			<load arg="79"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<push arg="80"/>
			<call arg="81"/>
			<call arg="30"/>
			<set arg="80"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<push arg="82"/>
			<call arg="81"/>
			<call arg="30"/>
			<set arg="82"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="83" begin="11" end="11"/>
			<lne id="84" begin="12" end="12"/>
			<lne id="85" begin="11" end="13"/>
			<lne id="86" begin="9" end="15"/>
			<lne id="87" begin="18" end="18"/>
			<lne id="88" begin="19" end="19"/>
			<lne id="89" begin="18" end="20"/>
			<lne id="90" begin="16" end="22"/>
			<lne id="74" begin="8" end="23"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="66" begin="7" end="23"/>
			<lve slot="2" name="64" begin="3" end="23"/>
			<lve slot="0" name="17" begin="0" end="23"/>
			<lve slot="1" name="91" begin="0" end="23"/>
		</localvariabletable>
	</operation>
	<operation name="92">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="55"/>
			<push arg="56"/>
			<findme/>
			<push arg="57"/>
			<call arg="58"/>
			<iterate/>
			<store arg="19"/>
			<load arg="19"/>
			<get arg="38"/>
			<push arg="48"/>
			<call arg="59"/>
			<call arg="60"/>
			<if arg="61"/>
			<getasm/>
			<get arg="1"/>
			<push arg="62"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="48"/>
			<pcall arg="63"/>
			<dup/>
			<push arg="64"/>
			<load arg="19"/>
			<pcall arg="65"/>
			<dup/>
			<push arg="66"/>
			<push arg="48"/>
			<push arg="67"/>
			<new/>
			<pcall arg="68"/>
			<pusht/>
			<pcall arg="69"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="93" begin="7" end="7"/>
			<lne id="94" begin="7" end="8"/>
			<lne id="95" begin="9" end="9"/>
			<lne id="96" begin="7" end="10"/>
			<lne id="97" begin="25" end="30"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="64" begin="6" end="32"/>
			<lve slot="0" name="17" begin="0" end="33"/>
		</localvariabletable>
	</operation>
	<operation name="98">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="76"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="64"/>
			<call arg="77"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="66"/>
			<call arg="78"/>
			<store arg="79"/>
			<load arg="79"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<push arg="99"/>
			<call arg="100"/>
			<call arg="30"/>
			<set arg="99"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="101" begin="11" end="11"/>
			<lne id="102" begin="12" end="12"/>
			<lne id="103" begin="11" end="13"/>
			<lne id="104" begin="9" end="15"/>
			<lne id="97" begin="8" end="16"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="66" begin="7" end="16"/>
			<lve slot="2" name="64" begin="3" end="16"/>
			<lve slot="0" name="17" begin="0" end="16"/>
			<lve slot="1" name="91" begin="0" end="16"/>
		</localvariabletable>
	</operation>
	<operation name="105">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="55"/>
			<push arg="56"/>
			<findme/>
			<push arg="57"/>
			<call arg="58"/>
			<iterate/>
			<store arg="19"/>
			<load arg="19"/>
			<get arg="38"/>
			<push arg="50"/>
			<call arg="59"/>
			<call arg="60"/>
			<if arg="61"/>
			<getasm/>
			<get arg="1"/>
			<push arg="62"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="50"/>
			<pcall arg="63"/>
			<dup/>
			<push arg="64"/>
			<load arg="19"/>
			<pcall arg="65"/>
			<dup/>
			<push arg="66"/>
			<push arg="50"/>
			<push arg="67"/>
			<new/>
			<pcall arg="68"/>
			<pusht/>
			<pcall arg="69"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="106" begin="7" end="7"/>
			<lne id="107" begin="7" end="8"/>
			<lne id="108" begin="9" end="9"/>
			<lne id="109" begin="7" end="10"/>
			<lne id="110" begin="25" end="30"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="64" begin="6" end="32"/>
			<lve slot="0" name="17" begin="0" end="33"/>
		</localvariabletable>
	</operation>
	<operation name="111">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="76"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="64"/>
			<call arg="77"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="66"/>
			<call arg="78"/>
			<store arg="79"/>
			<load arg="79"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<push arg="112"/>
			<call arg="113"/>
			<call arg="30"/>
			<set arg="112"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="114" begin="11" end="11"/>
			<lne id="115" begin="12" end="12"/>
			<lne id="116" begin="11" end="13"/>
			<lne id="117" begin="9" end="15"/>
			<lne id="110" begin="8" end="16"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="66" begin="7" end="16"/>
			<lve slot="2" name="64" begin="3" end="16"/>
			<lve slot="0" name="17" begin="0" end="16"/>
			<lve slot="1" name="91" begin="0" end="16"/>
		</localvariabletable>
	</operation>
	<operation name="118">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="55"/>
			<push arg="56"/>
			<findme/>
			<push arg="57"/>
			<call arg="58"/>
			<iterate/>
			<store arg="19"/>
			<load arg="19"/>
			<get arg="38"/>
			<push arg="52"/>
			<call arg="59"/>
			<call arg="60"/>
			<if arg="61"/>
			<getasm/>
			<get arg="1"/>
			<push arg="62"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="52"/>
			<pcall arg="63"/>
			<dup/>
			<push arg="64"/>
			<load arg="19"/>
			<pcall arg="65"/>
			<dup/>
			<push arg="66"/>
			<push arg="52"/>
			<push arg="67"/>
			<new/>
			<pcall arg="68"/>
			<pusht/>
			<pcall arg="69"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="119" begin="7" end="7"/>
			<lne id="120" begin="7" end="8"/>
			<lne id="121" begin="9" end="9"/>
			<lne id="122" begin="7" end="10"/>
			<lne id="123" begin="25" end="30"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="64" begin="6" end="32"/>
			<lve slot="0" name="17" begin="0" end="33"/>
		</localvariabletable>
	</operation>
	<operation name="124">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="76"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="64"/>
			<call arg="77"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="66"/>
			<call arg="78"/>
			<store arg="79"/>
			<load arg="79"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="123" begin="8" end="9"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="66" begin="7" end="9"/>
			<lve slot="2" name="64" begin="3" end="9"/>
			<lve slot="0" name="17" begin="0" end="9"/>
			<lve slot="1" name="91" begin="0" end="9"/>
		</localvariabletable>
	</operation>
</asm>
