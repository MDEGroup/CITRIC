<?xml version = '1.0' encoding = 'ISO-8859-1' ?>
<asm version="1.0" name="0">
	<cp>
		<constant value="TypeA2TypeB"/>
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
		<constant value="A.__matchRootA2RootB():V"/>
		<constant value="A.__matchDefinition():V"/>
		<constant value="A.__matchElement():V"/>
		<constant value="__exec__"/>
		<constant value="RootA2RootB"/>
		<constant value="NTransientLinkSet;.getLinksByRule(S):QNTransientLink;"/>
		<constant value="A.__applyRootA2RootB(NTransientLink;):V"/>
		<constant value="Definition"/>
		<constant value="A.__applyDefinition(NTransientLink;):V"/>
		<constant value="Element"/>
		<constant value="A.__applyElement(NTransientLink;):V"/>
		<constant value="__matchRootA2RootB"/>
		<constant value="RootA"/>
		<constant value="TypeA"/>
		<constant value="a"/>
		<constant value="MMOF!Classifier;.allInstancesFrom(S):QJ"/>
		<constant value="RootB"/>
		<constant value="TypeB"/>
		<constant value="bIn"/>
		<constant value="TransientLink"/>
		<constant value="NTransientLink;.setRule(MATL!Rule;):V"/>
		<constant value="rtA"/>
		<constant value="NTransientLink;.addSourceElement(SJ):V"/>
		<constant value="rtBIN"/>
		<constant value="rtB"/>
		<constant value="NTransientLink;.addTargetElement(SJ):V"/>
		<constant value="NTransientLinkSet;.addLink2(NTransientLink;B):V"/>
		<constant value="11:3-14:4"/>
		<constant value="__applyRootA2RootB"/>
		<constant value="NTransientLink;"/>
		<constant value="NTransientLink;.getSourceElement(S):J"/>
		<constant value="3"/>
		<constant value="NTransientLink;.getTargetElement(S):J"/>
		<constant value="4"/>
		<constant value="defs"/>
		<constant value="elms"/>
		<constant value="12:12-12:17"/>
		<constant value="12:12-12:22"/>
		<constant value="12:4-12:22"/>
		<constant value="13:12-13:15"/>
		<constant value="13:12-13:20"/>
		<constant value="13:4-13:20"/>
		<constant value="link"/>
		<constant value="__matchDefinition"/>
		<constant value="DefinitionB"/>
		<constant value="s"/>
		<constant value="t"/>
		<constant value="21:3-23:4"/>
		<constant value="__applyDefinition"/>
		<constant value="22:12-22:13"/>
		<constant value="22:12-22:18"/>
		<constant value="22:4-22:18"/>
		<constant value="__matchElement"/>
		<constant value="ElementA"/>
		<constant value="ElementB"/>
		<constant value="30:3-32:4"/>
		<constant value="__applyElement"/>
		<constant value="J.allInstancesFrom(J):J"/>
		<constant value="J.=(J):J"/>
		<constant value="B.not():B"/>
		<constant value="CJ.including(J):CJ"/>
		<constant value="CJ.asSequence():QJ"/>
		<constant value="QJ.first():J"/>
		<constant value="definition"/>
		<constant value="31:18-31:35"/>
		<constant value="31:53-31:58"/>
		<constant value="31:18-31:59"/>
		<constant value="31:69-31:70"/>
		<constant value="31:69-31:75"/>
		<constant value="31:78-31:79"/>
		<constant value="31:78-31:84"/>
		<constant value="31:69-31:84"/>
		<constant value="31:18-31:85"/>
		<constant value="31:4-31:85"/>
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
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="5"/>
		</localvariabletable>
	</operation>
	<operation name="43">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<push arg="44"/>
			<call arg="45"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="46"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="47"/>
			<call arg="45"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="48"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="49"/>
			<call arg="45"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="50"/>
			<enditerate/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="33" begin="5" end="8"/>
			<lve slot="1" name="33" begin="15" end="18"/>
			<lve slot="1" name="33" begin="25" end="28"/>
			<lve slot="0" name="17" begin="0" end="29"/>
		</localvariabletable>
	</operation>
	<operation name="51">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="52"/>
			<push arg="53"/>
			<findme/>
			<push arg="54"/>
			<call arg="55"/>
			<iterate/>
			<store arg="19"/>
			<push arg="56"/>
			<push arg="57"/>
			<findme/>
			<push arg="58"/>
			<call arg="55"/>
			<iterate/>
			<store arg="29"/>
			<getasm/>
			<get arg="1"/>
			<push arg="59"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="44"/>
			<pcall arg="60"/>
			<dup/>
			<push arg="61"/>
			<load arg="19"/>
			<pcall arg="62"/>
			<dup/>
			<push arg="63"/>
			<load arg="29"/>
			<pcall arg="62"/>
			<dup/>
			<push arg="64"/>
			<push arg="56"/>
			<push arg="57"/>
			<new/>
			<pcall arg="65"/>
			<pusht/>
			<pcall arg="66"/>
			<enditerate/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="67" begin="30" end="35"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="61" begin="6" end="37"/>
			<lve slot="2" name="63" begin="13" end="38"/>
			<lve slot="0" name="17" begin="0" end="39"/>
		</localvariabletable>
	</operation>
	<operation name="68">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="69"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="61"/>
			<call arg="70"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="63"/>
			<call arg="70"/>
			<store arg="71"/>
			<load arg="19"/>
			<push arg="64"/>
			<call arg="72"/>
			<store arg="73"/>
			<load arg="73"/>
			<dup/>
			<getasm/>
			<load arg="71"/>
			<get arg="74"/>
			<call arg="30"/>
			<set arg="74"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="75"/>
			<call arg="30"/>
			<set arg="75"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="76" begin="15" end="15"/>
			<lne id="77" begin="15" end="16"/>
			<lne id="78" begin="13" end="18"/>
			<lne id="79" begin="21" end="21"/>
			<lne id="80" begin="21" end="22"/>
			<lne id="81" begin="19" end="24"/>
			<lne id="67" begin="12" end="25"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="4" name="64" begin="11" end="25"/>
			<lve slot="2" name="61" begin="3" end="25"/>
			<lve slot="3" name="63" begin="7" end="25"/>
			<lve slot="0" name="17" begin="0" end="25"/>
			<lve slot="1" name="82" begin="0" end="25"/>
		</localvariabletable>
	</operation>
	<operation name="83">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="84"/>
			<push arg="57"/>
			<findme/>
			<push arg="58"/>
			<call arg="55"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="59"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="47"/>
			<pcall arg="60"/>
			<dup/>
			<push arg="85"/>
			<load arg="19"/>
			<pcall arg="62"/>
			<dup/>
			<push arg="86"/>
			<push arg="84"/>
			<push arg="57"/>
			<new/>
			<pcall arg="65"/>
			<pusht/>
			<pcall arg="66"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="87" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="85" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="88">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="69"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="85"/>
			<call arg="70"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="86"/>
			<call arg="72"/>
			<store arg="71"/>
			<load arg="71"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="38"/>
			<call arg="30"/>
			<set arg="38"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="89" begin="11" end="11"/>
			<lne id="90" begin="11" end="12"/>
			<lne id="91" begin="9" end="14"/>
			<lne id="87" begin="8" end="15"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="86" begin="7" end="15"/>
			<lve slot="2" name="85" begin="3" end="15"/>
			<lve slot="0" name="17" begin="0" end="15"/>
			<lve slot="1" name="82" begin="0" end="15"/>
		</localvariabletable>
	</operation>
	<operation name="92">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="93"/>
			<push arg="53"/>
			<findme/>
			<push arg="54"/>
			<call arg="55"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="59"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="49"/>
			<pcall arg="60"/>
			<dup/>
			<push arg="85"/>
			<load arg="19"/>
			<pcall arg="62"/>
			<dup/>
			<push arg="86"/>
			<push arg="94"/>
			<push arg="57"/>
			<new/>
			<pcall arg="65"/>
			<pusht/>
			<pcall arg="66"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="95" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="85" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="96">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="69"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="85"/>
			<call arg="70"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="86"/>
			<call arg="72"/>
			<store arg="71"/>
			<load arg="71"/>
			<dup/>
			<getasm/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<push arg="84"/>
			<push arg="57"/>
			<findme/>
			<push arg="58"/>
			<call arg="97"/>
			<iterate/>
			<store arg="73"/>
			<load arg="73"/>
			<get arg="38"/>
			<load arg="29"/>
			<get arg="38"/>
			<call arg="98"/>
			<call arg="99"/>
			<if arg="27"/>
			<load arg="73"/>
			<call arg="100"/>
			<enditerate/>
			<call arg="101"/>
			<call arg="102"/>
			<call arg="30"/>
			<set arg="103"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="104" begin="14" end="16"/>
			<lne id="105" begin="17" end="17"/>
			<lne id="106" begin="14" end="18"/>
			<lne id="107" begin="21" end="21"/>
			<lne id="108" begin="21" end="22"/>
			<lne id="109" begin="23" end="23"/>
			<lne id="110" begin="23" end="24"/>
			<lne id="111" begin="21" end="25"/>
			<lne id="112" begin="11" end="32"/>
			<lne id="113" begin="9" end="34"/>
			<lne id="95" begin="8" end="35"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="4" name="33" begin="20" end="29"/>
			<lve slot="3" name="86" begin="7" end="35"/>
			<lve slot="2" name="85" begin="3" end="35"/>
			<lve slot="0" name="17" begin="0" end="35"/>
			<lve slot="1" name="82" begin="0" end="35"/>
		</localvariabletable>
	</operation>
</asm>
