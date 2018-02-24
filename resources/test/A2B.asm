<?xml version = '1.0' encoding = 'ISO-8859-1' ?>
<asm version="1.0" name="0">
	<cp>
		<constant value="A2B"/>
		<constant value="links"/>
		<constant value="NTransientLinkSet;"/>
		<constant value="col"/>
		<constant value="J"/>
		<constant value="counter"/>
		<constant value="main"/>
		<constant value="A"/>
		<constant value="OclParametrizedType"/>
		<constant value="#native"/>
		<constant value="Collection"/>
		<constant value="J.setName(S):V"/>
		<constant value="OclSimpleType"/>
		<constant value="OclAny"/>
		<constant value="J.setElementType(J):V"/>
		<constant value="1"/>
		<constant value="TransientLinkSet"/>
		<constant value="A.__matcher__():V"/>
		<constant value="A.__exec__():V"/>
		<constant value="5:33-5:34"/>
		<constant value="self"/>
		<constant value="__resolve__"/>
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
		<constant value="A.__matchA2D():V"/>
		<constant value="__exec__"/>
		<constant value="A2D"/>
		<constant value="NTransientLinkSet;.getLinksByRule(S):QNTransientLink;"/>
		<constant value="A.__applyA2D(NTransientLink;):V"/>
		<constant value="__matchA2D"/>
		<constant value="IN"/>
		<constant value="MMOF!Classifier;.allInstancesFrom(S):QJ"/>
		<constant value="B"/>
		<constant value="C"/>
		<constant value="3"/>
		<constant value="TransientLink"/>
		<constant value="NTransientLink;.setRule(MATL!Rule;):V"/>
		<constant value="s_1"/>
		<constant value="NTransientLink;.addSourceElement(SJ):V"/>
		<constant value="s_2"/>
		<constant value="s_3"/>
		<constant value="t_1"/>
		<constant value="F"/>
		<constant value="NTransientLink;.addTargetElement(SJ):V"/>
		<constant value="t_2"/>
		<constant value="G"/>
		<constant value="NTransientLinkSet;.addLink2(NTransientLink;B):V"/>
		<constant value="13:3-13:89"/>
		<constant value="14:3-14:89"/>
		<constant value="__applyA2D"/>
		<constant value="NTransientLink;"/>
		<constant value="NTransientLink;.getSourceElement(S):J"/>
		<constant value="4"/>
		<constant value="NTransientLink;.getTargetElement(S):J"/>
		<constant value="5"/>
		<constant value="6"/>
		<constant value="J.oclType():J"/>
		<constant value="J.toString():J"/>
		<constant value="J.toLower():J"/>
		<constant value="_"/>
		<constant value="J.+(J):J"/>
		<constant value="13:22-13:25"/>
		<constant value="13:22-13:35"/>
		<constant value="13:22-13:40"/>
		<constant value="13:22-13:51"/>
		<constant value="13:22-13:61"/>
		<constant value="13:64-13:67"/>
		<constant value="13:22-13:67"/>
		<constant value="13:70-13:80"/>
		<constant value="13:70-13:88"/>
		<constant value="13:22-13:88"/>
		<constant value="13:14-13:88"/>
		<constant value="14:22-14:25"/>
		<constant value="14:22-14:35"/>
		<constant value="14:22-14:40"/>
		<constant value="14:22-14:51"/>
		<constant value="14:22-14:61"/>
		<constant value="14:64-14:67"/>
		<constant value="14:22-14:67"/>
		<constant value="14:70-14:80"/>
		<constant value="14:70-14:88"/>
		<constant value="14:22-14:88"/>
		<constant value="14:14-14:88"/>
		<constant value="16:3-16:13"/>
		<constant value="16:25-16:35"/>
		<constant value="16:25-16:43"/>
		<constant value="16:46-16:47"/>
		<constant value="16:25-16:47"/>
		<constant value="16:3-16:48"/>
		<constant value="15:2-17:3"/>
		<constant value="link"/>
	</cp>
	<field name="1" type="2"/>
	<field name="3" type="4"/>
	<field name="5" type="4"/>
	<operation name="6">
		<context type="7"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<push arg="8"/>
			<push arg="9"/>
			<new/>
			<dup/>
			<push arg="10"/>
			<pcall arg="11"/>
			<dup/>
			<push arg="12"/>
			<push arg="9"/>
			<new/>
			<dup/>
			<push arg="13"/>
			<pcall arg="11"/>
			<pcall arg="14"/>
			<set arg="3"/>
			<getasm/>
			<pushi arg="15"/>
			<set arg="5"/>
			<getasm/>
			<push arg="16"/>
			<push arg="9"/>
			<new/>
			<set arg="1"/>
			<getasm/>
			<pcall arg="17"/>
			<getasm/>
			<pcall arg="18"/>
		</code>
		<linenumbertable>
			<lne id="19" begin="17" end="17"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="20" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="21">
		<context type="7"/>
		<parameters>
			<parameter name="15" type="4"/>
		</parameters>
		<code>
			<load arg="15"/>
			<getasm/>
			<get arg="3"/>
			<call arg="22"/>
			<if arg="23"/>
			<getasm/>
			<get arg="1"/>
			<load arg="15"/>
			<call arg="24"/>
			<dup/>
			<call arg="25"/>
			<if arg="26"/>
			<load arg="15"/>
			<call arg="27"/>
			<goto arg="28"/>
			<pop/>
			<load arg="15"/>
			<goto arg="29"/>
			<push arg="30"/>
			<push arg="9"/>
			<new/>
			<load arg="15"/>
			<iterate/>
			<store arg="31"/>
			<getasm/>
			<load arg="31"/>
			<call arg="32"/>
			<call arg="33"/>
			<enditerate/>
			<call arg="34"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="35" begin="23" end="27"/>
			<lve slot="0" name="20" begin="0" end="29"/>
			<lve slot="1" name="36" begin="0" end="29"/>
		</localvariabletable>
	</operation>
	<operation name="37">
		<context type="7"/>
		<parameters>
			<parameter name="15" type="4"/>
			<parameter name="31" type="38"/>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<load arg="15"/>
			<call arg="24"/>
			<load arg="15"/>
			<load arg="31"/>
			<call arg="39"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="20" begin="0" end="6"/>
			<lve slot="1" name="36" begin="0" end="6"/>
			<lve slot="2" name="40" begin="0" end="6"/>
		</localvariabletable>
	</operation>
	<operation name="41">
		<context type="7"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<pcall arg="42"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="20" begin="0" end="1"/>
		</localvariabletable>
	</operation>
	<operation name="43">
		<context type="7"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<push arg="44"/>
			<call arg="45"/>
			<iterate/>
			<store arg="15"/>
			<getasm/>
			<load arg="15"/>
			<pcall arg="46"/>
			<enditerate/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="35" begin="5" end="8"/>
			<lve slot="0" name="20" begin="0" end="9"/>
		</localvariabletable>
	</operation>
	<operation name="47">
		<context type="7"/>
		<parameters>
		</parameters>
		<code>
			<push arg="7"/>
			<push arg="7"/>
			<findme/>
			<push arg="48"/>
			<call arg="49"/>
			<iterate/>
			<store arg="15"/>
			<push arg="50"/>
			<push arg="7"/>
			<findme/>
			<push arg="48"/>
			<call arg="49"/>
			<iterate/>
			<store arg="31"/>
			<push arg="51"/>
			<push arg="7"/>
			<findme/>
			<push arg="48"/>
			<call arg="49"/>
			<iterate/>
			<store arg="52"/>
			<getasm/>
			<get arg="1"/>
			<push arg="53"/>
			<push arg="9"/>
			<new/>
			<dup/>
			<push arg="44"/>
			<pcall arg="54"/>
			<dup/>
			<push arg="55"/>
			<load arg="15"/>
			<pcall arg="56"/>
			<dup/>
			<push arg="57"/>
			<load arg="31"/>
			<pcall arg="56"/>
			<dup/>
			<push arg="58"/>
			<load arg="52"/>
			<pcall arg="56"/>
			<dup/>
			<push arg="59"/>
			<push arg="60"/>
			<push arg="50"/>
			<new/>
			<pcall arg="61"/>
			<dup/>
			<push arg="62"/>
			<push arg="63"/>
			<push arg="50"/>
			<new/>
			<pcall arg="61"/>
			<pusht/>
			<pcall arg="64"/>
			<enditerate/>
			<enditerate/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="65" begin="41" end="46"/>
			<lne id="66" begin="47" end="52"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="55" begin="6" end="54"/>
			<lve slot="2" name="57" begin="13" end="55"/>
			<lve slot="3" name="58" begin="20" end="56"/>
			<lve slot="0" name="20" begin="0" end="57"/>
		</localvariabletable>
	</operation>
	<operation name="67">
		<context type="7"/>
		<parameters>
			<parameter name="15" type="68"/>
		</parameters>
		<code>
			<load arg="15"/>
			<push arg="55"/>
			<call arg="69"/>
			<store arg="31"/>
			<load arg="15"/>
			<push arg="57"/>
			<call arg="69"/>
			<store arg="52"/>
			<load arg="15"/>
			<push arg="58"/>
			<call arg="69"/>
			<store arg="70"/>
			<load arg="15"/>
			<push arg="59"/>
			<call arg="71"/>
			<store arg="72"/>
			<load arg="15"/>
			<push arg="62"/>
			<call arg="71"/>
			<store arg="73"/>
			<load arg="72"/>
			<dup/>
			<getasm/>
			<load arg="72"/>
			<call arg="74"/>
			<get arg="40"/>
			<call arg="75"/>
			<call arg="76"/>
			<push arg="77"/>
			<call arg="78"/>
			<getasm/>
			<get arg="5"/>
			<call arg="78"/>
			<call arg="32"/>
			<set arg="40"/>
			<pop/>
			<load arg="73"/>
			<dup/>
			<getasm/>
			<load arg="73"/>
			<call arg="74"/>
			<get arg="40"/>
			<call arg="75"/>
			<call arg="76"/>
			<push arg="77"/>
			<call arg="78"/>
			<getasm/>
			<get arg="5"/>
			<call arg="78"/>
			<call arg="32"/>
			<set arg="40"/>
			<pop/>
			<getasm/>
			<getasm/>
			<get arg="5"/>
			<pushi arg="15"/>
			<call arg="78"/>
			<set arg="5"/>
		</code>
		<linenumbertable>
			<lne id="79" begin="23" end="23"/>
			<lne id="80" begin="23" end="24"/>
			<lne id="81" begin="23" end="25"/>
			<lne id="82" begin="23" end="26"/>
			<lne id="83" begin="23" end="27"/>
			<lne id="84" begin="28" end="28"/>
			<lne id="85" begin="23" end="29"/>
			<lne id="86" begin="30" end="30"/>
			<lne id="87" begin="30" end="31"/>
			<lne id="88" begin="23" end="32"/>
			<lne id="89" begin="21" end="34"/>
			<lne id="65" begin="20" end="35"/>
			<lne id="90" begin="39" end="39"/>
			<lne id="91" begin="39" end="40"/>
			<lne id="92" begin="39" end="41"/>
			<lne id="93" begin="39" end="42"/>
			<lne id="94" begin="39" end="43"/>
			<lne id="95" begin="44" end="44"/>
			<lne id="96" begin="39" end="45"/>
			<lne id="97" begin="46" end="46"/>
			<lne id="98" begin="46" end="47"/>
			<lne id="99" begin="39" end="48"/>
			<lne id="100" begin="37" end="50"/>
			<lne id="66" begin="36" end="51"/>
			<lne id="101" begin="52" end="52"/>
			<lne id="102" begin="53" end="53"/>
			<lne id="103" begin="53" end="54"/>
			<lne id="104" begin="55" end="55"/>
			<lne id="105" begin="53" end="56"/>
			<lne id="106" begin="52" end="57"/>
			<lne id="107" begin="52" end="57"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="5" name="59" begin="15" end="57"/>
			<lve slot="6" name="62" begin="19" end="57"/>
			<lve slot="2" name="55" begin="3" end="57"/>
			<lve slot="3" name="57" begin="7" end="57"/>
			<lve slot="4" name="58" begin="11" end="57"/>
			<lve slot="0" name="20" begin="0" end="57"/>
			<lve slot="1" name="108" begin="0" end="57"/>
		</localvariabletable>
	</operation>
</asm>
