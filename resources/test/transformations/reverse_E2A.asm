<?xml version = '1.0' encoding = 'ISO-8859-1' ?>
<asm version="1.0" name="0">
	<cp>
		<constant value="E2A"/>
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
		<constant value="A.__matchR_S2B():V"/>
		<constant value="__exec__"/>
		<constant value="R_S2B"/>
		<constant value="NTransientLinkSet;.getLinksByRule(S):QNTransientLink;"/>
		<constant value="A.__applyR_S2B(NTransientLink;):V"/>
		<constant value="__matchR_S2B"/>
		<constant value="R"/>
		<constant value="E"/>
		<constant value="IN"/>
		<constant value="MMOF!Classifier;.allInstancesFrom(S):QJ"/>
		<constant value="J.size():J"/>
		<constant value="J.substring(JJ):J"/>
		<constant value="asd"/>
		<constant value="J.debug(J):J"/>
		<constant value="J.=(J):J"/>
		<constant value="B.not():B"/>
		<constant value="57"/>
		<constant value="TransientLink"/>
		<constant value="NTransientLink;.setRule(MATL!Rule;):V"/>
		<constant value="r_1"/>
		<constant value="NTransientLink;.addSourceElement(SJ):V"/>
		<constant value="s_2"/>
		<constant value="t"/>
		<constant value="B"/>
		<constant value="NTransientLink;.addTargetElement(SJ):V"/>
		<constant value="NTransientLinkSet;.addLink2(NTransientLink;B):V"/>
		<constant value="12:14-12:17"/>
		<constant value="12:14-12:22"/>
		<constant value="12:33-12:34"/>
		<constant value="12:35-12:38"/>
		<constant value="12:35-12:43"/>
		<constant value="12:35-12:50"/>
		<constant value="12:14-12:51"/>
		<constant value="12:58-12:63"/>
		<constant value="12:14-12:64"/>
		<constant value="12:67-12:70"/>
		<constant value="12:67-12:75"/>
		<constant value="12:86-12:87"/>
		<constant value="12:88-12:91"/>
		<constant value="12:88-12:96"/>
		<constant value="12:88-12:103"/>
		<constant value="12:67-12:104"/>
		<constant value="12:14-12:104"/>
		<constant value="14:3-14:46"/>
		<constant value="__applyR_S2B"/>
		<constant value="NTransientLink;"/>
		<constant value="NTransientLink;.getSourceElement(S):J"/>
		<constant value="3"/>
		<constant value="NTransientLink;.getTargetElement(S):J"/>
		<constant value="4"/>
		<constant value=" "/>
		<constant value="J.+(J):J"/>
		<constant value="14:20-14:23"/>
		<constant value="14:20-14:28"/>
		<constant value="14:31-14:34"/>
		<constant value="14:20-14:34"/>
		<constant value="14:37-14:40"/>
		<constant value="14:37-14:45"/>
		<constant value="14:20-14:45"/>
		<constant value="14:12-14:45"/>
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
			<push arg="48"/>
			<push arg="49"/>
			<findme/>
			<push arg="50"/>
			<call arg="51"/>
			<iterate/>
			<store arg="15"/>
			<push arg="38"/>
			<push arg="49"/>
			<findme/>
			<push arg="50"/>
			<call arg="51"/>
			<iterate/>
			<store arg="31"/>
			<load arg="15"/>
			<get arg="40"/>
			<pushi arg="31"/>
			<load arg="15"/>
			<get arg="40"/>
			<call arg="52"/>
			<call arg="53"/>
			<push arg="54"/>
			<call arg="55"/>
			<load arg="31"/>
			<get arg="40"/>
			<pushi arg="31"/>
			<load arg="31"/>
			<get arg="40"/>
			<call arg="52"/>
			<call arg="53"/>
			<call arg="56"/>
			<call arg="57"/>
			<if arg="58"/>
			<getasm/>
			<get arg="1"/>
			<push arg="59"/>
			<push arg="9"/>
			<new/>
			<dup/>
			<push arg="44"/>
			<pcall arg="60"/>
			<dup/>
			<push arg="61"/>
			<load arg="15"/>
			<pcall arg="62"/>
			<dup/>
			<push arg="63"/>
			<load arg="31"/>
			<pcall arg="62"/>
			<dup/>
			<push arg="64"/>
			<push arg="65"/>
			<push arg="7"/>
			<new/>
			<pcall arg="66"/>
			<pusht/>
			<pcall arg="67"/>
			<enditerate/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="68" begin="14" end="14"/>
			<lne id="69" begin="14" end="15"/>
			<lne id="70" begin="16" end="16"/>
			<lne id="71" begin="17" end="17"/>
			<lne id="72" begin="17" end="18"/>
			<lne id="73" begin="17" end="19"/>
			<lne id="74" begin="14" end="20"/>
			<lne id="75" begin="21" end="21"/>
			<lne id="76" begin="14" end="22"/>
			<lne id="77" begin="23" end="23"/>
			<lne id="78" begin="23" end="24"/>
			<lne id="79" begin="25" end="25"/>
			<lne id="80" begin="26" end="26"/>
			<lne id="81" begin="26" end="27"/>
			<lne id="82" begin="26" end="28"/>
			<lne id="83" begin="23" end="29"/>
			<lne id="84" begin="14" end="30"/>
			<lne id="85" begin="49" end="54"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="61" begin="6" end="56"/>
			<lve slot="2" name="63" begin="13" end="57"/>
			<lve slot="0" name="20" begin="0" end="58"/>
		</localvariabletable>
	</operation>
	<operation name="86">
		<context type="7"/>
		<parameters>
			<parameter name="15" type="87"/>
		</parameters>
		<code>
			<load arg="15"/>
			<push arg="61"/>
			<call arg="88"/>
			<store arg="31"/>
			<load arg="15"/>
			<push arg="63"/>
			<call arg="88"/>
			<store arg="89"/>
			<load arg="15"/>
			<push arg="64"/>
			<call arg="90"/>
			<store arg="91"/>
			<load arg="91"/>
			<dup/>
			<getasm/>
			<load arg="31"/>
			<get arg="40"/>
			<push arg="92"/>
			<call arg="93"/>
			<load arg="89"/>
			<get arg="40"/>
			<call arg="93"/>
			<call arg="32"/>
			<set arg="40"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="94" begin="15" end="15"/>
			<lne id="95" begin="15" end="16"/>
			<lne id="96" begin="17" end="17"/>
			<lne id="97" begin="15" end="18"/>
			<lne id="98" begin="19" end="19"/>
			<lne id="99" begin="19" end="20"/>
			<lne id="100" begin="15" end="21"/>
			<lne id="101" begin="13" end="23"/>
			<lne id="85" begin="12" end="24"/>
			<lne id="102" begin="25" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="4" name="64" begin="11" end="24"/>
			<lve slot="2" name="61" begin="3" end="24"/>
			<lve slot="3" name="63" begin="7" end="24"/>
			<lve slot="0" name="20" begin="0" end="24"/>
			<lve slot="1" name="103" begin="0" end="24"/>
		</localvariabletable>
	</operation>
</asm>
