<?xml version = '1.0' encoding = 'ISO-8859-1' ?>
<asm version="1.0" name="0">
	<cp>
		<constant value="orgchart2Company"/>
		<constant value="links"/>
		<constant value="NTransientLinkSet;"/>
		<constant value="col"/>
		<constant value="J"/>
		<constant value="getModel"/>
		<constant value="main"/>
		<constant value="A"/>
		<constant value="OclParametrizedType"/>
		<constant value="#native"/>
		<constant value="Collection"/>
		<constant value="J.setName(S):V"/>
		<constant value="OclSimpleType"/>
		<constant value="OclAny"/>
		<constant value="J.setElementType(J):V"/>
		<constant value="Sequence"/>
		<constant value="QJ.first():J"/>
		<constant value="TransientLinkSet"/>
		<constant value="A.__matcher__():V"/>
		<constant value="A.__exec__():V"/>
		<constant value="7:49-7:61"/>
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
		<constant value="A.__matchOrgchart2Company():V"/>
		<constant value="A.__matchPresident2Employee():V"/>
		<constant value="A.__matchMember2Employee():V"/>
		<constant value="__exec__"/>
		<constant value="Orgchart2Company"/>
		<constant value="NTransientLinkSet;.getLinksByRule(S):QNTransientLink;"/>
		<constant value="A.__applyOrgchart2Company(NTransientLink;):V"/>
		<constant value="President2Employee"/>
		<constant value="A.__applyPresident2Employee(NTransientLink;):V"/>
		<constant value="Member2Employee"/>
		<constant value="A.__applyMember2Employee(NTransientLink;):V"/>
		<constant value="__matchOrgchart2Company"/>
		<constant value="orgchartModel"/>
		<constant value="Orgchart"/>
		<constant value="IN"/>
		<constant value="MMOF!Classifier;.allInstancesFrom(S):QJ"/>
		<constant value="TransientLink"/>
		<constant value="NTransientLink;.setRule(MATL!Rule;):V"/>
		<constant value="s"/>
		<constant value="NTransientLink;.addSourceElement(SJ):V"/>
		<constant value="t"/>
		<constant value="Company"/>
		<constant value="MM"/>
		<constant value="NTransientLink;.addTargetElement(SJ):V"/>
		<constant value="NTransientLinkSet;.addLink2(NTransientLink;B):V"/>
		<constant value="11:5-13:27"/>
		<constant value="__applyOrgchart2Company"/>
		<constant value="NTransientLink;"/>
		<constant value="NTransientLink;.getSourceElement(S):J"/>
		<constant value="NTransientLink;.getTargetElement(S):J"/>
		<constant value="3"/>
		<constant value="president"/>
		<constant value="companyName"/>
		<constant value="employees"/>
		<constant value="12:10-12:11"/>
		<constant value="12:10-12:21"/>
		<constant value="12:10-12:33"/>
		<constant value="12:2-12:33"/>
		<constant value="13:15-13:16"/>
		<constant value="13:15-13:26"/>
		<constant value="13:2-13:26"/>
		<constant value="15:3-15:13"/>
		<constant value="15:24-15:25"/>
		<constant value="15:3-15:26"/>
		<constant value="14:2-16:3"/>
		<constant value="link"/>
		<constant value="__matchPresident2Employee"/>
		<constant value="Member"/>
		<constant value="boss"/>
		<constant value="J.oclIsUndefined():J"/>
		<constant value="B.not():B"/>
		<constant value="32"/>
		<constant value="Employee"/>
		<constant value="20:25-20:26"/>
		<constant value="20:25-20:31"/>
		<constant value="20:25-20:48"/>
		<constant value="21:5-25:3"/>
		<constant value="__applyPresident2Employee"/>
		<constant value="role"/>
		<constant value="company"/>
		<constant value="22:10-22:11"/>
		<constant value="22:10-22:16"/>
		<constant value="22:2-22:16"/>
		<constant value="23:10-23:11"/>
		<constant value="23:10-23:16"/>
		<constant value="23:2-23:16"/>
		<constant value="24:13-24:23"/>
		<constant value="24:13-24:32"/>
		<constant value="24:2-24:32"/>
		<constant value="__matchMember2Employee"/>
		<constant value="J.not():J"/>
		<constant value="33"/>
		<constant value="29:30-29:31"/>
		<constant value="29:30-29:36"/>
		<constant value="29:30-29:53"/>
		<constant value="29:26-29:53"/>
		<constant value="30:5-35:3"/>
		<constant value="__applyMember2Employee"/>
		<constant value="31:9-31:10"/>
		<constant value="31:9-31:15"/>
		<constant value="31:3-31:15"/>
		<constant value="32:11-32:12"/>
		<constant value="32:11-32:17"/>
		<constant value="32:3-32:17"/>
		<constant value="33:15-33:25"/>
		<constant value="33:15-33:34"/>
		<constant value="33:4-33:34"/>
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
			<push arg="15"/>
			<push arg="9"/>
			<new/>
			<call arg="16"/>
			<set arg="5"/>
			<getasm/>
			<push arg="17"/>
			<push arg="9"/>
			<new/>
			<set arg="1"/>
			<getasm/>
			<pcall arg="18"/>
			<getasm/>
			<pcall arg="19"/>
		</code>
		<linenumbertable>
			<lne id="20" begin="17" end="20"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="21" begin="0" end="30"/>
		</localvariabletable>
	</operation>
	<operation name="22">
		<context type="7"/>
		<parameters>
			<parameter name="23" type="4"/>
		</parameters>
		<code>
			<load arg="23"/>
			<getasm/>
			<get arg="3"/>
			<call arg="24"/>
			<if arg="25"/>
			<getasm/>
			<get arg="1"/>
			<load arg="23"/>
			<call arg="26"/>
			<dup/>
			<call arg="27"/>
			<if arg="28"/>
			<load arg="23"/>
			<call arg="29"/>
			<goto arg="30"/>
			<pop/>
			<load arg="23"/>
			<goto arg="31"/>
			<push arg="15"/>
			<push arg="9"/>
			<new/>
			<load arg="23"/>
			<iterate/>
			<store arg="32"/>
			<getasm/>
			<load arg="32"/>
			<call arg="33"/>
			<call arg="34"/>
			<enditerate/>
			<call arg="35"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="36" begin="23" end="27"/>
			<lve slot="0" name="21" begin="0" end="29"/>
			<lve slot="1" name="37" begin="0" end="29"/>
		</localvariabletable>
	</operation>
	<operation name="38">
		<context type="7"/>
		<parameters>
			<parameter name="23" type="4"/>
			<parameter name="32" type="39"/>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<load arg="23"/>
			<call arg="26"/>
			<load arg="23"/>
			<load arg="32"/>
			<call arg="40"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="21" begin="0" end="6"/>
			<lve slot="1" name="37" begin="0" end="6"/>
			<lve slot="2" name="41" begin="0" end="6"/>
		</localvariabletable>
	</operation>
	<operation name="42">
		<context type="7"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<pcall arg="43"/>
			<getasm/>
			<pcall arg="44"/>
			<getasm/>
			<pcall arg="45"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="21" begin="0" end="5"/>
		</localvariabletable>
	</operation>
	<operation name="46">
		<context type="7"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<push arg="47"/>
			<call arg="48"/>
			<iterate/>
			<store arg="23"/>
			<getasm/>
			<load arg="23"/>
			<pcall arg="49"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="50"/>
			<call arg="48"/>
			<iterate/>
			<store arg="23"/>
			<getasm/>
			<load arg="23"/>
			<pcall arg="51"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="52"/>
			<call arg="48"/>
			<iterate/>
			<store arg="23"/>
			<getasm/>
			<load arg="23"/>
			<pcall arg="53"/>
			<enditerate/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="36" begin="5" end="8"/>
			<lve slot="1" name="36" begin="15" end="18"/>
			<lve slot="1" name="36" begin="25" end="28"/>
			<lve slot="0" name="21" begin="0" end="29"/>
		</localvariabletable>
	</operation>
	<operation name="54">
		<context type="7"/>
		<parameters>
		</parameters>
		<code>
			<push arg="55"/>
			<push arg="56"/>
			<findme/>
			<push arg="57"/>
			<call arg="58"/>
			<iterate/>
			<store arg="23"/>
			<getasm/>
			<get arg="1"/>
			<push arg="59"/>
			<push arg="9"/>
			<new/>
			<dup/>
			<push arg="47"/>
			<pcall arg="60"/>
			<dup/>
			<push arg="61"/>
			<load arg="23"/>
			<pcall arg="62"/>
			<dup/>
			<push arg="63"/>
			<push arg="64"/>
			<push arg="65"/>
			<new/>
			<pcall arg="66"/>
			<pusht/>
			<pcall arg="67"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="68" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="61" begin="6" end="26"/>
			<lve slot="0" name="21" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="69">
		<context type="7"/>
		<parameters>
			<parameter name="23" type="70"/>
		</parameters>
		<code>
			<load arg="23"/>
			<push arg="61"/>
			<call arg="71"/>
			<store arg="32"/>
			<load arg="23"/>
			<push arg="63"/>
			<call arg="72"/>
			<store arg="73"/>
			<load arg="73"/>
			<dup/>
			<getasm/>
			<load arg="32"/>
			<get arg="74"/>
			<get arg="75"/>
			<call arg="33"/>
			<set arg="41"/>
			<dup/>
			<getasm/>
			<load arg="32"/>
			<get arg="74"/>
			<call arg="33"/>
			<set arg="76"/>
			<pop/>
			<getasm/>
			<load arg="32"/>
			<set arg="5"/>
		</code>
		<linenumbertable>
			<lne id="77" begin="11" end="11"/>
			<lne id="78" begin="11" end="12"/>
			<lne id="79" begin="11" end="13"/>
			<lne id="80" begin="9" end="15"/>
			<lne id="81" begin="18" end="18"/>
			<lne id="82" begin="18" end="19"/>
			<lne id="83" begin="16" end="21"/>
			<lne id="68" begin="8" end="22"/>
			<lne id="84" begin="23" end="23"/>
			<lne id="85" begin="24" end="24"/>
			<lne id="86" begin="23" end="25"/>
			<lne id="87" begin="23" end="25"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="63" begin="7" end="25"/>
			<lve slot="2" name="61" begin="3" end="25"/>
			<lve slot="0" name="21" begin="0" end="25"/>
			<lve slot="1" name="88" begin="0" end="25"/>
		</localvariabletable>
	</operation>
	<operation name="89">
		<context type="7"/>
		<parameters>
		</parameters>
		<code>
			<push arg="90"/>
			<push arg="56"/>
			<findme/>
			<push arg="57"/>
			<call arg="58"/>
			<iterate/>
			<store arg="23"/>
			<load arg="23"/>
			<get arg="91"/>
			<call arg="92"/>
			<call arg="93"/>
			<if arg="94"/>
			<getasm/>
			<get arg="1"/>
			<push arg="59"/>
			<push arg="9"/>
			<new/>
			<dup/>
			<push arg="50"/>
			<pcall arg="60"/>
			<dup/>
			<push arg="61"/>
			<load arg="23"/>
			<pcall arg="62"/>
			<dup/>
			<push arg="63"/>
			<push arg="95"/>
			<push arg="65"/>
			<new/>
			<pcall arg="66"/>
			<pusht/>
			<pcall arg="67"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="96" begin="7" end="7"/>
			<lne id="97" begin="7" end="8"/>
			<lne id="98" begin="7" end="9"/>
			<lne id="99" begin="24" end="29"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="61" begin="6" end="31"/>
			<lve slot="0" name="21" begin="0" end="32"/>
		</localvariabletable>
	</operation>
	<operation name="100">
		<context type="7"/>
		<parameters>
			<parameter name="23" type="70"/>
		</parameters>
		<code>
			<load arg="23"/>
			<push arg="61"/>
			<call arg="71"/>
			<store arg="32"/>
			<load arg="23"/>
			<push arg="63"/>
			<call arg="72"/>
			<store arg="73"/>
			<load arg="73"/>
			<dup/>
			<getasm/>
			<load arg="32"/>
			<get arg="41"/>
			<call arg="33"/>
			<set arg="41"/>
			<dup/>
			<getasm/>
			<load arg="32"/>
			<get arg="101"/>
			<call arg="33"/>
			<set arg="101"/>
			<dup/>
			<getasm/>
			<getasm/>
			<get arg="5"/>
			<call arg="33"/>
			<set arg="102"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="103" begin="11" end="11"/>
			<lne id="104" begin="11" end="12"/>
			<lne id="105" begin="9" end="14"/>
			<lne id="106" begin="17" end="17"/>
			<lne id="107" begin="17" end="18"/>
			<lne id="108" begin="15" end="20"/>
			<lne id="109" begin="23" end="23"/>
			<lne id="110" begin="23" end="24"/>
			<lne id="111" begin="21" end="26"/>
			<lne id="99" begin="8" end="27"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="63" begin="7" end="27"/>
			<lve slot="2" name="61" begin="3" end="27"/>
			<lve slot="0" name="21" begin="0" end="27"/>
			<lve slot="1" name="88" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="112">
		<context type="7"/>
		<parameters>
		</parameters>
		<code>
			<push arg="90"/>
			<push arg="56"/>
			<findme/>
			<push arg="57"/>
			<call arg="58"/>
			<iterate/>
			<store arg="23"/>
			<load arg="23"/>
			<get arg="91"/>
			<call arg="92"/>
			<call arg="113"/>
			<call arg="93"/>
			<if arg="114"/>
			<getasm/>
			<get arg="1"/>
			<push arg="59"/>
			<push arg="9"/>
			<new/>
			<dup/>
			<push arg="52"/>
			<pcall arg="60"/>
			<dup/>
			<push arg="61"/>
			<load arg="23"/>
			<pcall arg="62"/>
			<dup/>
			<push arg="63"/>
			<push arg="95"/>
			<push arg="65"/>
			<new/>
			<pcall arg="66"/>
			<pusht/>
			<pcall arg="67"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="115" begin="7" end="7"/>
			<lne id="116" begin="7" end="8"/>
			<lne id="117" begin="7" end="9"/>
			<lne id="118" begin="7" end="10"/>
			<lne id="119" begin="25" end="30"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="61" begin="6" end="32"/>
			<lve slot="0" name="21" begin="0" end="33"/>
		</localvariabletable>
	</operation>
	<operation name="120">
		<context type="7"/>
		<parameters>
			<parameter name="23" type="70"/>
		</parameters>
		<code>
			<load arg="23"/>
			<push arg="61"/>
			<call arg="71"/>
			<store arg="32"/>
			<load arg="23"/>
			<push arg="63"/>
			<call arg="72"/>
			<store arg="73"/>
			<load arg="73"/>
			<dup/>
			<getasm/>
			<load arg="32"/>
			<get arg="41"/>
			<call arg="33"/>
			<set arg="41"/>
			<dup/>
			<getasm/>
			<load arg="32"/>
			<get arg="101"/>
			<call arg="33"/>
			<set arg="101"/>
			<dup/>
			<getasm/>
			<getasm/>
			<get arg="5"/>
			<call arg="33"/>
			<set arg="102"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="121" begin="11" end="11"/>
			<lne id="122" begin="11" end="12"/>
			<lne id="123" begin="9" end="14"/>
			<lne id="124" begin="17" end="17"/>
			<lne id="125" begin="17" end="18"/>
			<lne id="126" begin="15" end="20"/>
			<lne id="127" begin="23" end="23"/>
			<lne id="128" begin="23" end="24"/>
			<lne id="129" begin="21" end="26"/>
			<lne id="119" begin="8" end="27"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="63" begin="7" end="27"/>
			<lve slot="2" name="61" begin="3" end="27"/>
			<lve slot="0" name="21" begin="0" end="27"/>
			<lve slot="1" name="88" begin="0" end="27"/>
		</localvariabletable>
	</operation>
</asm>
