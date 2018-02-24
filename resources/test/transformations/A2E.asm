<?xml version = '1.0' encoding = 'ISO-8859-1' ?>
<asm version="1.0" name="0">
	<cp>
		<constant value="A2E"/>
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
		<constant value="A.__matchB2R_S():V"/>
		<constant value="__exec__"/>
		<constant value="B2R_S"/>
		<constant value="NTransientLinkSet;.getLinksByRule(S):QNTransientLink;"/>
		<constant value="A.__applyB2R_S(NTransientLink;):V"/>
		<constant value="__matchB2R_S"/>
		<constant value="B"/>
		<constant value="IN"/>
		<constant value="MMOF!Classifier;.allInstancesFrom(S):QJ"/>
		<constant value="TransientLink"/>
		<constant value="NTransientLink;.setRule(MATL!Rule;):V"/>
		<constant value="s"/>
		<constant value="NTransientLink;.addSourceElement(SJ):V"/>
		<constant value="t_1"/>
		<constant value="R"/>
		<constant value="E"/>
		<constant value="NTransientLink;.addTargetElement(SJ):V"/>
		<constant value="t_2"/>
		<constant value="NTransientLinkSet;.addLink2(NTransientLink;B):V"/>
		<constant value="11:3-11:54"/>
		<constant value="12:3-12:54"/>
		<constant value="__applyB2R_S"/>
		<constant value="NTransientLink;"/>
		<constant value="NTransientLink;.getSourceElement(S):J"/>
		<constant value="NTransientLink;.getTargetElement(S):J"/>
		<constant value="3"/>
		<constant value="4"/>
		<constant value="r_"/>
		<constant value="J.+(J):J"/>
		<constant value="s_"/>
		<constant value="11:22-11:25"/>
		<constant value="11:28-11:32"/>
		<constant value="11:22-11:32"/>
		<constant value="11:35-11:45"/>
		<constant value="11:35-11:53"/>
		<constant value="11:22-11:53"/>
		<constant value="11:14-11:53"/>
		<constant value="12:22-12:25"/>
		<constant value="12:28-12:32"/>
		<constant value="12:22-12:32"/>
		<constant value="12:35-12:45"/>
		<constant value="12:35-12:53"/>
		<constant value="12:22-12:53"/>
		<constant value="12:14-12:53"/>
		<constant value="14:3-14:13"/>
		<constant value="14:25-14:35"/>
		<constant value="14:25-14:43"/>
		<constant value="14:46-14:47"/>
		<constant value="14:25-14:47"/>
		<constant value="14:3-14:48"/>
		<constant value="13:2-15:3"/>
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
			<push arg="48"/>
			<push arg="7"/>
			<findme/>
			<push arg="49"/>
			<call arg="50"/>
			<iterate/>
			<store arg="15"/>
			<getasm/>
			<get arg="1"/>
			<push arg="51"/>
			<push arg="9"/>
			<new/>
			<dup/>
			<push arg="44"/>
			<pcall arg="52"/>
			<dup/>
			<push arg="53"/>
			<load arg="15"/>
			<pcall arg="54"/>
			<dup/>
			<push arg="55"/>
			<push arg="56"/>
			<push arg="57"/>
			<new/>
			<pcall arg="58"/>
			<dup/>
			<push arg="59"/>
			<push arg="38"/>
			<push arg="57"/>
			<new/>
			<pcall arg="58"/>
			<pusht/>
			<pcall arg="60"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="61" begin="19" end="24"/>
			<lne id="62" begin="25" end="30"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="53" begin="6" end="32"/>
			<lve slot="0" name="20" begin="0" end="33"/>
		</localvariabletable>
	</operation>
	<operation name="63">
		<context type="7"/>
		<parameters>
			<parameter name="15" type="64"/>
		</parameters>
		<code>
			<load arg="15"/>
			<push arg="53"/>
			<call arg="65"/>
			<store arg="31"/>
			<load arg="15"/>
			<push arg="55"/>
			<call arg="66"/>
			<store arg="67"/>
			<load arg="15"/>
			<push arg="59"/>
			<call arg="66"/>
			<store arg="68"/>
			<load arg="67"/>
			<dup/>
			<getasm/>
			<load arg="67"/>
			<push arg="69"/>
			<call arg="70"/>
			<getasm/>
			<get arg="5"/>
			<call arg="70"/>
			<call arg="32"/>
			<set arg="40"/>
			<pop/>
			<load arg="68"/>
			<dup/>
			<getasm/>
			<load arg="68"/>
			<push arg="71"/>
			<call arg="70"/>
			<getasm/>
			<get arg="5"/>
			<call arg="70"/>
			<call arg="32"/>
			<set arg="40"/>
			<pop/>
			<getasm/>
			<getasm/>
			<get arg="5"/>
			<pushi arg="15"/>
			<call arg="70"/>
			<set arg="5"/>
		</code>
		<linenumbertable>
			<lne id="72" begin="15" end="15"/>
			<lne id="73" begin="16" end="16"/>
			<lne id="74" begin="15" end="17"/>
			<lne id="75" begin="18" end="18"/>
			<lne id="76" begin="18" end="19"/>
			<lne id="77" begin="15" end="20"/>
			<lne id="78" begin="13" end="22"/>
			<lne id="61" begin="12" end="23"/>
			<lne id="79" begin="27" end="27"/>
			<lne id="80" begin="28" end="28"/>
			<lne id="81" begin="27" end="29"/>
			<lne id="82" begin="30" end="30"/>
			<lne id="83" begin="30" end="31"/>
			<lne id="84" begin="27" end="32"/>
			<lne id="85" begin="25" end="34"/>
			<lne id="62" begin="24" end="35"/>
			<lne id="86" begin="36" end="36"/>
			<lne id="87" begin="37" end="37"/>
			<lne id="88" begin="37" end="38"/>
			<lne id="89" begin="39" end="39"/>
			<lne id="90" begin="37" end="40"/>
			<lne id="91" begin="36" end="41"/>
			<lne id="92" begin="36" end="41"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="55" begin="7" end="41"/>
			<lve slot="4" name="59" begin="11" end="41"/>
			<lve slot="2" name="53" begin="3" end="41"/>
			<lve slot="0" name="20" begin="0" end="41"/>
			<lve slot="1" name="93" begin="0" end="41"/>
		</localvariabletable>
	</operation>
</asm>
