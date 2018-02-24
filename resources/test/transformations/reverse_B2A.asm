<?xml version = '1.0' encoding = 'ISO-8859-1' ?>
<asm version="1.0" name="0">
	<cp>
		<constant value="B2A"/>
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
		<constant value="A.__matchD2A():V"/>
		<constant value="A.__matchF_G2C():V"/>
		<constant value="__exec__"/>
		<constant value="D2A"/>
		<constant value="NTransientLinkSet;.getLinksByRule(S):QNTransientLink;"/>
		<constant value="A.__applyD2A(NTransientLink;):V"/>
		<constant value="F_G2C"/>
		<constant value="A.__applyF_G2C(NTransientLink;):V"/>
		<constant value="__matchD2A"/>
		<constant value="D"/>
		<constant value="B"/>
		<constant value="IN"/>
		<constant value="MMOF!Classifier;.allInstancesFrom(S):QJ"/>
		<constant value="TransientLink"/>
		<constant value="NTransientLink;.setRule(MATL!Rule;):V"/>
		<constant value="s"/>
		<constant value="NTransientLink;.addSourceElement(SJ):V"/>
		<constant value="t"/>
		<constant value="NTransientLink;.addTargetElement(SJ):V"/>
		<constant value="NTransientLinkSet;.addLink2(NTransientLink;B):V"/>
		<constant value="11:3-11:85"/>
		<constant value="__applyD2A"/>
		<constant value="NTransientLink;"/>
		<constant value="NTransientLink;.getSourceElement(S):J"/>
		<constant value="NTransientLink;.getTargetElement(S):J"/>
		<constant value="3"/>
		<constant value="J.oclType():J"/>
		<constant value="J.toString():J"/>
		<constant value="J.toLower():J"/>
		<constant value="_"/>
		<constant value="J.+(J):J"/>
		<constant value="11:20-11:21"/>
		<constant value="11:20-11:31"/>
		<constant value="11:20-11:36"/>
		<constant value="11:20-11:47"/>
		<constant value="11:20-11:57"/>
		<constant value="11:60-11:63"/>
		<constant value="11:20-11:63"/>
		<constant value="11:66-11:76"/>
		<constant value="11:66-11:84"/>
		<constant value="11:20-11:84"/>
		<constant value="11:12-11:84"/>
		<constant value="13:3-13:13"/>
		<constant value="13:25-13:35"/>
		<constant value="13:25-13:43"/>
		<constant value="13:46-13:47"/>
		<constant value="13:25-13:47"/>
		<constant value="13:3-13:48"/>
		<constant value="12:2-14:3"/>
		<constant value="link"/>
		<constant value="__matchF_G2C"/>
		<constant value="F"/>
		<constant value="G"/>
		<constant value="s_1"/>
		<constant value="s_2"/>
		<constant value="C"/>
		<constant value="22:3-22:85"/>
		<constant value="__applyF_G2C"/>
		<constant value="4"/>
		<constant value="22:20-22:21"/>
		<constant value="22:20-22:31"/>
		<constant value="22:20-22:36"/>
		<constant value="22:20-22:47"/>
		<constant value="22:20-22:57"/>
		<constant value="22:60-22:63"/>
		<constant value="22:20-22:63"/>
		<constant value="22:66-22:76"/>
		<constant value="22:66-22:84"/>
		<constant value="22:20-22:84"/>
		<constant value="22:12-22:84"/>
		<constant value="24:3-24:13"/>
		<constant value="24:25-24:35"/>
		<constant value="24:25-24:43"/>
		<constant value="24:46-24:47"/>
		<constant value="24:25-24:47"/>
		<constant value="24:3-24:48"/>
		<constant value="23:2-25:3"/>
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
			<getasm/>
			<pcall arg="43"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="20" begin="0" end="3"/>
		</localvariabletable>
	</operation>
	<operation name="44">
		<context type="7"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<push arg="45"/>
			<call arg="46"/>
			<iterate/>
			<store arg="15"/>
			<getasm/>
			<load arg="15"/>
			<pcall arg="47"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="48"/>
			<call arg="46"/>
			<iterate/>
			<store arg="15"/>
			<getasm/>
			<load arg="15"/>
			<pcall arg="49"/>
			<enditerate/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="35" begin="5" end="8"/>
			<lve slot="1" name="35" begin="15" end="18"/>
			<lve slot="0" name="20" begin="0" end="19"/>
		</localvariabletable>
	</operation>
	<operation name="50">
		<context type="7"/>
		<parameters>
		</parameters>
		<code>
			<push arg="51"/>
			<push arg="52"/>
			<findme/>
			<push arg="53"/>
			<call arg="54"/>
			<iterate/>
			<store arg="15"/>
			<getasm/>
			<get arg="1"/>
			<push arg="55"/>
			<push arg="9"/>
			<new/>
			<dup/>
			<push arg="45"/>
			<pcall arg="56"/>
			<dup/>
			<push arg="57"/>
			<load arg="15"/>
			<pcall arg="58"/>
			<dup/>
			<push arg="59"/>
			<push arg="7"/>
			<push arg="7"/>
			<new/>
			<pcall arg="60"/>
			<pusht/>
			<pcall arg="61"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="62" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="57" begin="6" end="26"/>
			<lve slot="0" name="20" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="63">
		<context type="7"/>
		<parameters>
			<parameter name="15" type="64"/>
		</parameters>
		<code>
			<load arg="15"/>
			<push arg="57"/>
			<call arg="65"/>
			<store arg="31"/>
			<load arg="15"/>
			<push arg="59"/>
			<call arg="66"/>
			<store arg="67"/>
			<load arg="67"/>
			<dup/>
			<getasm/>
			<load arg="67"/>
			<call arg="68"/>
			<get arg="40"/>
			<call arg="69"/>
			<call arg="70"/>
			<push arg="71"/>
			<call arg="72"/>
			<getasm/>
			<get arg="5"/>
			<call arg="72"/>
			<call arg="32"/>
			<set arg="40"/>
			<pop/>
			<getasm/>
			<getasm/>
			<get arg="5"/>
			<pushi arg="15"/>
			<call arg="72"/>
			<set arg="5"/>
		</code>
		<linenumbertable>
			<lne id="73" begin="11" end="11"/>
			<lne id="74" begin="11" end="12"/>
			<lne id="75" begin="11" end="13"/>
			<lne id="76" begin="11" end="14"/>
			<lne id="77" begin="11" end="15"/>
			<lne id="78" begin="16" end="16"/>
			<lne id="79" begin="11" end="17"/>
			<lne id="80" begin="18" end="18"/>
			<lne id="81" begin="18" end="19"/>
			<lne id="82" begin="11" end="20"/>
			<lne id="83" begin="9" end="22"/>
			<lne id="62" begin="8" end="23"/>
			<lne id="84" begin="24" end="24"/>
			<lne id="85" begin="25" end="25"/>
			<lne id="86" begin="25" end="26"/>
			<lne id="87" begin="27" end="27"/>
			<lne id="88" begin="25" end="28"/>
			<lne id="89" begin="24" end="29"/>
			<lne id="90" begin="24" end="29"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="59" begin="7" end="29"/>
			<lve slot="2" name="57" begin="3" end="29"/>
			<lve slot="0" name="20" begin="0" end="29"/>
			<lve slot="1" name="91" begin="0" end="29"/>
		</localvariabletable>
	</operation>
	<operation name="92">
		<context type="7"/>
		<parameters>
		</parameters>
		<code>
			<push arg="93"/>
			<push arg="52"/>
			<findme/>
			<push arg="53"/>
			<call arg="54"/>
			<iterate/>
			<store arg="15"/>
			<push arg="94"/>
			<push arg="52"/>
			<findme/>
			<push arg="53"/>
			<call arg="54"/>
			<iterate/>
			<store arg="31"/>
			<getasm/>
			<get arg="1"/>
			<push arg="55"/>
			<push arg="9"/>
			<new/>
			<dup/>
			<push arg="48"/>
			<pcall arg="56"/>
			<dup/>
			<push arg="95"/>
			<load arg="15"/>
			<pcall arg="58"/>
			<dup/>
			<push arg="96"/>
			<load arg="31"/>
			<pcall arg="58"/>
			<dup/>
			<push arg="59"/>
			<push arg="97"/>
			<push arg="7"/>
			<new/>
			<pcall arg="60"/>
			<pusht/>
			<pcall arg="61"/>
			<enditerate/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="98" begin="30" end="35"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="95" begin="6" end="37"/>
			<lve slot="2" name="96" begin="13" end="38"/>
			<lve slot="0" name="20" begin="0" end="39"/>
		</localvariabletable>
	</operation>
	<operation name="99">
		<context type="7"/>
		<parameters>
			<parameter name="15" type="64"/>
		</parameters>
		<code>
			<load arg="15"/>
			<push arg="95"/>
			<call arg="65"/>
			<store arg="31"/>
			<load arg="15"/>
			<push arg="96"/>
			<call arg="65"/>
			<store arg="67"/>
			<load arg="15"/>
			<push arg="59"/>
			<call arg="66"/>
			<store arg="100"/>
			<load arg="100"/>
			<dup/>
			<getasm/>
			<load arg="100"/>
			<call arg="68"/>
			<get arg="40"/>
			<call arg="69"/>
			<call arg="70"/>
			<push arg="71"/>
			<call arg="72"/>
			<getasm/>
			<get arg="5"/>
			<call arg="72"/>
			<call arg="32"/>
			<set arg="40"/>
			<pop/>
			<getasm/>
			<getasm/>
			<get arg="5"/>
			<pushi arg="15"/>
			<call arg="72"/>
			<set arg="5"/>
		</code>
		<linenumbertable>
			<lne id="101" begin="15" end="15"/>
			<lne id="102" begin="15" end="16"/>
			<lne id="103" begin="15" end="17"/>
			<lne id="104" begin="15" end="18"/>
			<lne id="105" begin="15" end="19"/>
			<lne id="106" begin="20" end="20"/>
			<lne id="107" begin="15" end="21"/>
			<lne id="108" begin="22" end="22"/>
			<lne id="109" begin="22" end="23"/>
			<lne id="110" begin="15" end="24"/>
			<lne id="111" begin="13" end="26"/>
			<lne id="98" begin="12" end="27"/>
			<lne id="112" begin="28" end="28"/>
			<lne id="113" begin="29" end="29"/>
			<lne id="114" begin="29" end="30"/>
			<lne id="115" begin="31" end="31"/>
			<lne id="116" begin="29" end="32"/>
			<lne id="117" begin="28" end="33"/>
			<lne id="118" begin="28" end="33"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="4" name="59" begin="11" end="33"/>
			<lve slot="2" name="95" begin="3" end="33"/>
			<lve slot="3" name="96" begin="7" end="33"/>
			<lve slot="0" name="20" begin="0" end="33"/>
			<lve slot="1" name="91" begin="0" end="33"/>
		</localvariabletable>
	</operation>
</asm>
