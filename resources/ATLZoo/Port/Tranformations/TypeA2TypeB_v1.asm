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
		<constant value="A.__matchBlkA2BlkB():V"/>
		<constant value="__exec__"/>
		<constant value="BlkA2BlkB"/>
		<constant value="NTransientLinkSet;.getLinksByRule(S):QNTransientLink;"/>
		<constant value="A.__applyBlkA2BlkB(NTransientLink;):V"/>
		<constant value="__matchBlkA2BlkB"/>
		<constant value="BlockA"/>
		<constant value="TypeA"/>
		<constant value="inA"/>
		<constant value="MMOF!Classifier;.allInstancesFrom(S):QJ"/>
		<constant value="TransientLink"/>
		<constant value="NTransientLink;.setRule(MATL!Rule;):V"/>
		<constant value="blkA"/>
		<constant value="NTransientLink;.addSourceElement(SJ):V"/>
		<constant value="blkB"/>
		<constant value="BlockB"/>
		<constant value="TypeB"/>
		<constant value="NTransientLink;.addTargetElement(SJ):V"/>
		<constant value="inPts"/>
		<constant value="inputPorts"/>
		<constant value="InPortB"/>
		<constant value="CJ.including(J):CJ"/>
		<constant value="outPts"/>
		<constant value="outputPorts"/>
		<constant value="OutPortB"/>
		<constant value="NTransientLinkSet;.addLink2(NTransientLink;B):V"/>
		<constant value="11:3-14:4"/>
		<constant value="15:49-15:53"/>
		<constant value="15:49-15:64"/>
		<constant value="15:3-16:22"/>
		<constant value="17:51-17:55"/>
		<constant value="17:51-17:67"/>
		<constant value="17:3-18:22"/>
		<constant value="__applyBlkA2BlkB"/>
		<constant value="NTransientLink;"/>
		<constant value="NTransientLink;.getSourceElement(S):J"/>
		<constant value="NTransientLink;.getTargetElement(S):J"/>
		<constant value="3"/>
		<constant value="4"/>
		<constant value="5"/>
		<constant value="6"/>
		<constant value="CJ.asSequence():QJ"/>
		<constant value="7"/>
		<constant value="QJ.at(I):J"/>
		<constant value="8"/>
		<constant value="B.not():B"/>
		<constant value="52"/>
		<constant value="I.+(I):I"/>
		<constant value="84"/>
		<constant value="12:18-12:23"/>
		<constant value="12:4-12:23"/>
		<constant value="13:19-13:25"/>
		<constant value="13:4-13:25"/>
		<constant value="16:13-16:16"/>
		<constant value="16:13-16:21"/>
		<constant value="16:5-16:21"/>
		<constant value="18:13-18:16"/>
		<constant value="18:13-18:21"/>
		<constant value="18:5-18:21"/>
		<constant value="ptA"/>
		<constant value="collection"/>
		<constant value="counter"/>
		<constant value="link"/>
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
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="1"/>
		</localvariabletable>
	</operation>
	<operation name="41">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<push arg="42"/>
			<call arg="43"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="44"/>
			<enditerate/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="33" begin="5" end="8"/>
			<lve slot="0" name="17" begin="0" end="9"/>
		</localvariabletable>
	</operation>
	<operation name="45">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="46"/>
			<push arg="47"/>
			<findme/>
			<push arg="48"/>
			<call arg="49"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="50"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="42"/>
			<pcall arg="51"/>
			<dup/>
			<push arg="52"/>
			<load arg="19"/>
			<pcall arg="53"/>
			<dup/>
			<push arg="54"/>
			<push arg="55"/>
			<push arg="56"/>
			<new/>
			<pcall arg="57"/>
			<dup/>
			<push arg="58"/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<load arg="19"/>
			<get arg="59"/>
			<iterate/>
			<pop/>
			<push arg="60"/>
			<push arg="56"/>
			<new/>
			<call arg="61"/>
			<enditerate/>
			<pcall arg="57"/>
			<dup/>
			<push arg="62"/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<load arg="19"/>
			<get arg="63"/>
			<iterate/>
			<pop/>
			<push arg="64"/>
			<push arg="56"/>
			<new/>
			<call arg="61"/>
			<enditerate/>
			<pcall arg="57"/>
			<pusht/>
			<pcall arg="65"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="66" begin="19" end="24"/>
			<lne id="67" begin="30" end="30"/>
			<lne id="68" begin="30" end="31"/>
			<lne id="69" begin="25" end="39"/>
			<lne id="70" begin="45" end="45"/>
			<lne id="71" begin="45" end="46"/>
			<lne id="72" begin="40" end="54"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="52" begin="6" end="56"/>
			<lve slot="0" name="17" begin="0" end="57"/>
		</localvariabletable>
	</operation>
	<operation name="73">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="74"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="52"/>
			<call arg="75"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="54"/>
			<call arg="76"/>
			<store arg="77"/>
			<load arg="19"/>
			<push arg="58"/>
			<call arg="76"/>
			<store arg="78"/>
			<load arg="19"/>
			<push arg="62"/>
			<call arg="76"/>
			<store arg="79"/>
			<load arg="77"/>
			<dup/>
			<getasm/>
			<load arg="78"/>
			<call arg="30"/>
			<set arg="59"/>
			<dup/>
			<getasm/>
			<load arg="79"/>
			<call arg="30"/>
			<set arg="63"/>
			<pop/>
			<pushi arg="19"/>
			<store arg="80"/>
			<load arg="29"/>
			<get arg="59"/>
			<call arg="81"/>
			<store arg="82"/>
			<load arg="78"/>
			<iterate/>
			<load arg="82"/>
			<load arg="80"/>
			<call arg="83"/>
			<store arg="84"/>
			<dup/>
			<getasm/>
			<load arg="84"/>
			<get arg="38"/>
			<dup/>
			<getasm/>
			<get arg="3"/>
			<call arg="20"/>
			<call arg="85"/>
			<if arg="86"/>
			<load arg="80"/>
			<call arg="83"/>
			<call arg="30"/>
			<set arg="38"/>
			<pop/>
			<load arg="80"/>
			<pushi arg="19"/>
			<call arg="87"/>
			<store arg="80"/>
			<enditerate/>
			<pushi arg="19"/>
			<store arg="80"/>
			<load arg="29"/>
			<get arg="63"/>
			<call arg="81"/>
			<store arg="82"/>
			<load arg="79"/>
			<iterate/>
			<load arg="82"/>
			<load arg="80"/>
			<call arg="83"/>
			<store arg="84"/>
			<dup/>
			<getasm/>
			<load arg="84"/>
			<get arg="38"/>
			<dup/>
			<getasm/>
			<get arg="3"/>
			<call arg="20"/>
			<call arg="85"/>
			<if arg="88"/>
			<load arg="80"/>
			<call arg="83"/>
			<call arg="30"/>
			<set arg="38"/>
			<pop/>
			<load arg="80"/>
			<pushi arg="19"/>
			<call arg="87"/>
			<store arg="80"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="89" begin="19" end="19"/>
			<lne id="90" begin="17" end="21"/>
			<lne id="91" begin="24" end="24"/>
			<lne id="92" begin="22" end="26"/>
			<lne id="66" begin="16" end="27"/>
			<lne id="67" begin="30" end="30"/>
			<lne id="68" begin="30" end="31"/>
			<lne id="93" begin="42" end="42"/>
			<lne id="94" begin="42" end="43"/>
			<lne id="95" begin="40" end="53"/>
			<lne id="69" begin="28" end="59"/>
			<lne id="70" begin="62" end="62"/>
			<lne id="71" begin="62" end="63"/>
			<lne id="96" begin="74" end="74"/>
			<lne id="97" begin="74" end="75"/>
			<lne id="98" begin="72" end="85"/>
			<lne id="72" begin="60" end="91"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="8" name="99" begin="39" end="53"/>
			<lve slot="7" name="100" begin="33" end="59"/>
			<lve slot="6" name="101" begin="29" end="59"/>
			<lve slot="8" name="99" begin="71" end="85"/>
			<lve slot="7" name="100" begin="65" end="91"/>
			<lve slot="6" name="101" begin="61" end="91"/>
			<lve slot="3" name="54" begin="7" end="91"/>
			<lve slot="4" name="58" begin="11" end="91"/>
			<lve slot="5" name="62" begin="15" end="91"/>
			<lve slot="2" name="52" begin="3" end="91"/>
			<lve slot="0" name="17" begin="0" end="91"/>
			<lve slot="1" name="102" begin="0" end="91"/>
		</localvariabletable>
	</operation>
</asm>
