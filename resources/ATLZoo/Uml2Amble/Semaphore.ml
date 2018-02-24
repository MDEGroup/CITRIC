open Amble

(* Channels definition *)
type canal_Query = p | v
type canal_Answer = ok

(* Process User *)
type etat_User = InCS | WaitForCS | OutOfCS

class User reseau_Answer reseau_Query id =
object(self)
	inherit ['a] process OutOfCS id

	val mutable CSRequired : bool = false

	(* Initialization *)
		method initialization =
		(* To be defined *)

	(* Definition of a method *)
		method received_ok message =
		(* To be defined *)
		method set_CSRequired_to_false message =
		(* To be defined *)

	(* Definition of a method *)
		method CS_used =
		(* To be defined *)
		method send_v =
		(* To be defined *)

	(* Definition of a method *)
		method CSRequired =
		(* To be defined *)
		method send_p =
		(* To be defined *)

	initializer
		let _ =
			self#initialization
		in
		(* Transitions definition *)
		self#strans	InCS OutOfCS 
				self#CS_used
				self#send_v

		self#strans	OutOfCS WaitForCS 
				self#CSRequired
				self#send_p

		self#trans	WaitForCS InCS 
				reseau_Answer
				0
				self#received_ok
				self#set_CSRequired_to_false
end

(* Process Semaphore *)
type etat_Semaphore = Ready

class Semaphore reseau_Answer reseau_Query id =
object(self)
	inherit ['a] process Ready id

	val mutable onHold : List = List.create()
	val mutable freeResourcesNb : int = 1

	(* Definition of a method *)
		method received_p message =
		(* To be defined *)
		method supprimer_RC unProcessus message =
		(* To be defined *)

	(* Definition of a method *)
		method received_v message =
		(* To be defined *)
		method ajout_RC unProcessus message =
		(* To be defined *)

	initializer
		(* Transitions definition *)
		self#trans_all	Ready Ready 
				reseau_Query
				self#received_v
				self#ajout_RC

		self#trans_all	Ready Ready 
				reseau_Query
				self#received_p
				self#supprimer_RC
end

(* System initialization and start up *)
let _ =
	load_settings true [| |];
	(* Please define network initialization *)
	start()
